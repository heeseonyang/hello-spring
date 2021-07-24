package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) { /*여기서 시스템이 아이디를 세팅해줌*/
        member.setId(++sequence);/* 시퀀스 값을 하나 올려줌 */
        store.put(member.getId(), member);
        return member;

    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); /*그냥 스토어에서 꺼내면됨, store.get(id)*/
        /*여기서 null로 반환될 수 있으니 Optional.ofNullable()로 감싸준다. */
    }

    @Override
    public Optional<Member> findByName(String name) {
       return store.values().stream() /*store에서 얘를 루프로 돌린다*/
               .filter(member -> member.getName().equals(name)) /*filter라해서 람다가 사용. 멤버.겟네임이 파라미터로 넘어온 네임과 같은지 확인. 같은 경우에만 필터링*/
               .findAny();/*그냥 찾으면 반환을 함. findAny()는 하나로도 찾는거. 이 결과가 Optional로 반횐됨. 값을 끝까지 찾아서 없으면 Optional에 null로 반환*/
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values()); /*store에 있는 values=member들을 반환한다.*/

    }

    public void clearStore() {
        store.clear();
    }
}
