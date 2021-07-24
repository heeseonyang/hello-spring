package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);/*optional은 자바8에 들어가있는 기능으로 findbyId로 가져올때 값이 없어 null값이 반환될 시 optional로 감싸서 반환한다.*/
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
