package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach(){ /*테스트 생성 전에 리퍼지토리를 만들고 얘를 멤버서비스에 넣어준다. 그럼 같은 레파지토리를 사용한다.*/
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach /*콜백메소드*/
    public void afterEach(){
        memberRepository.clearStore(); /*메소드 다 돌고 와서 다 클리어로 지워버림*/
    }

    @Test
    void 회원가입() {
        //given (이런 상황이 주어졌는데)
        Member member = new Member();
        member.setName("hello");

        //when(이게 실행됐을 때)
        Long saveId = memberService.join(member);

        //then(결과가 이게 나와야돼)
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외(){
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring"); /*member1의 name과 동일. 중복됨.*/

        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");


      /*
        memberService.join(member1);
        try {
            memberService.join(member2);
            fail();
        }catch(IllegalStateException e){
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/


        //then
    }


    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}