package hello.hellospring.service;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean /*스프링 빈에 등록해라*/
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }


    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository(); /*리퍼지토리는 인터페이스라 new가 안돼. 그래서 구현체인 얘를 new함*/
    }

}
