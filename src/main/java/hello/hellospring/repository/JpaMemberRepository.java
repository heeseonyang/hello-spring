package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;


public class JpaMemberRepository implements MemberRepository {

    private  final EntityManager em; /*jpa는 EntityManager라는 것으로 모든게 동작한다 */

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override/*저장*/
    public Member save(Member member) {
        em.persist(member);/*persist() 영구저장하다*/
        return member;
    } /*이렇게하면 jpa가 insert쿼리문 만들어서 db에 집어넣고 setId까지 member에 넣어줌*/

    @Override/*아이디조회*/
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);/*find(조회할 타입, 식별자pk값)*/
        return  Optional.ofNullable(member); /*optional로 반환하기때문에 값이 없을 수도 있어서 이렇게 쓴다*/

    }

    @Override/*이름조회*/
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();
    }

    @Override/*모두조회*/
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList(); /*객체를 대상으로 쿼리를 날리면 sql로 번역이 된다. 보통을 테이블을 대상으로 날림*/
    }/*select m -> member객체자체를 조회해라*/
}
