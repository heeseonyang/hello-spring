package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository  { /*인터페이스가 인터페이스를 받아서 implements가 아니라 extends */ /* <key,value> id가 Long형이라서,,*/ /*인터페이스는 다중상속이 가능하다.*/

    @Override
    Optional<Member> findByName(String name);
}
