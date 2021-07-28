package hello.hellospring.service;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    /* JDBC
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
*/

   /* JPA
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
*/
    /*스프링 데이터 JPA*/
    private  final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) { /*스프링멤버jpa가 구현체 만들어 놓은게 인젝션된다*/
        this.memberRepository = memberRepository;
    }

    @Bean /*스프링 빈에 등록해라*/
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }


/*
    AOP
    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }*/

  //  @Bean
   // public MemberRepository memberRepository(){
        //return new MemoryMemberRepository(); /*리퍼지토리는 인터페이스라 new가 안돼. 그래서 구현체인 얘를 new함*/
        //return new JdbcMemberRepository(dataSource); /*jdbc*/
        //return new JdbcTemplateMemberRepository(dataSource); /*JdbcTemplate*/
        //return new JpaMemberRepository(em);

  //  }

}
