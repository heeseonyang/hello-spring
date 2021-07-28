package hello.hellospring.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*회원가입*/
    public Long join(Member member) {
        /*같은 이름이 있는 중복 회원 X */

        long start = System.currentTimeMillis();

        try {
            validateDuplicateMember(member); //중복 회원 검증
            memberRepository.save(member);
            return member.getId();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("join = " + timeMs + "ms");
        }
    }

    private void validateDuplicateMember(Member member) { /* Ctrl + Shift + Alt + t : 리펙토링목록띄우기..메서드 뽑기 - Extract Method */
        memberRepository.findByName(member.getName())
               .ifPresent(m -> { /*이거 null 이 아니라 값이 존재하면 이미 존재하는 회원입니다. 라는 거.. 옵셔널로 감싸면 이렇게 여러 메소드를 쓸 수 있다.*/
                     throw new IllegalStateException("이미 존재하는 회원입니다.");
               });
    }


    /*전체 회원 조회*/
    public List<Member> findMembers(){

        long start = System.currentTimeMillis();

        try {
            return memberRepository.findAll();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("findMembers = " + timeMs + "ms");
        }
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
