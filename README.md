#1. 스프링 부트 시작하기 (SpringBoot 환경설정)


\-스프링부트란?

: 스프링 프레임워크를 복잡한 설정없이 쉽고 빠르게 사용할 수 있게 도와주는 라이브러리이다.

\-프로젝트 환경설정

1\. 스프링 부트 스타터 사이트로 이동해서 스프링 프로젝트 생성

(스프링 부트 기반으로 스프링 관련 프로젝트를 만들어주는 사이트)

\-> [http://start.spring.io](http://start.spring.io)

![image-20210728142534342](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728142534342.png)


위의 설정대로 프로젝트를 생성함.

![image-20210728142739374](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728142739374.png)

![image-20210728143134699](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143134699.png)

처음 임포트 할땐 라이브러리를 수십메가를 다운받기때문에 반드시 네트워크 연결이 되어있어야 하고 로딩이 오래걸린다.

![image-20210728143241870](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143241870.png)



요즘은 이렇게 main과 test로 나뉘어서 들어오는데

main의 java 밑에 실제 실행파일이 들어있고

test 안에는 test코드가 들어있다.

그만큼 요즘 test코드가 중요해졌다는 뜻이다.

자바파일을 제외한 나머지 환경설정파일 같은 것들은 resources

버전설정하고 라이브러리 땡겨오는 역할
![image-20210728143322201](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143322201.png)



#2. 빌드하고 실행하기 (Window환경에서)
빌드하고 실행하기 (window.ver)

인프런 강의를 따라가다보면

강사님 컴퓨터가 맥이다 보니 윈도우와 명령어가 다른 부분이 꽤 있다.

다른 명령어를 찾아서 적용시키는게 어려웠다.
![image-20210728143620923](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143620923.png)

![image-20210728144015432](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144015432.png)

./gradlew build  ---> gradlew.bat build

![image-20210728143731228](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143731228.png)

ls -arlth ---> dir /s

(ls -arlth : mac이나 리눅스는 ls를 사용해서 목록을 뽑는다.  arlth는 모든 파일, 폴더를 시간 역순으로 출력하는 명령어,

윈도우에서는 별도의 옵션 없이  dir만 사용하면 된다고 했지만 원하는 결과값이 나오지 않아

dir /?라고 입력하여 옵션에 대한 자세한 설명을 확인 한 후

dir /s를 사용하니 원하는 결과값이 나왔다. )


![image-20210728143757682](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143757682.png)

18m짜리 파일이 만들어져있다고 .

![image-20210728143850962](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143850962.png)


![image-20210728143934365](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728143934365.png)



실행확인!


#3. 스프링 웹 개발 기초 (정적 컨텐츠, MVC와 템플릿 엔진, API)

스프링 웹 개발 기초

-   정적컨텐츠 : 파일을 웹브라우저에 그대로 내려주는 것
-   MVC와 템플릿 엔진 : 예를 들어 과거의 JSP같은 것. 
    (이런게 소위 말하는 템플릿 엔진. HTML을 동적으로 바꿔 내림)
    [ 정적컨텐츠와의 차이 \]
    - 정적컨텐츠: 파일을 그대로 고객에게 보여줌 
    - MVC와 템플릿 엔진 : 서버에서 HTML을 조금 바꿔서 내려주는 방식
-   API : JSON형식으로 클라이언트에게 데이터를 전해줌 서버끼리 통신할때 --> API방식 많이 씀

---

## **1) 정적컨텐츠**

: 스프링부트는 기본적으로 정적컨텐츠를 제공한다.

![image-20210728144440633](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144440633.png)

resources -> static 폴더에 hello-static.html 파일 생성
![image-20210728144516198](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144516198.png)


html 코드 입력후 실행.
![image-20210728144554919](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144554919.png)
결과창

![image-20210728144638291](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144638291.png)

주소창에 localhost:8080 + 파일명 그대로 입력하면 내가 작성한 대로 글씨가 뜬다.

\--->원하는 파일을 그대로 넣으면 정적컨텐츠가 그대로 화면에 출력됨!


**정적컨텐츠의 원리**

1\. 웹브라우저에 주소를 친다. (localhost:8080/hello-static.html)

2\. 내장 톰켓서버가 요청을 받음

3\. 스프링에게 요청을 보냄

4\. 컨트롤러쪽에서 먼저 hello-static 관련 파일을 찾아본다.

5\. 컨트롤러에 이와 관련된 파일이 없으면 resources안에 있는  hello-static.html을 찾는다

6\. 파일을 발견하면 웹브라우저로 hello-static을 반환해준다.

## **2) MVC와 템플릿 엔진**

\-MVC : Model, View, Controller

필요한건 컨트롤러에서 처리하고 모델에 담아서 뷰에 보냄?

관심사를 분리해야한다!

-   Mode, Controllerl : 비지니스 로직과 관련, 내부적인걸 처리할때!
-    View: 화면을 그리는데에 모든 역량을 집중!

**Controller**

```
@Controller
public class HelloController {
 @GetMapping("hello-mvc")
 public String helloMvc(@RequestParam("name") String name, Model model) {
 	model.addAttribute("name", name);
 	return "hello-template";
   }
}
```

**View**

```
<html xmlns:th="http://www.thymeleaf.org">
<body>
<p th:text="'hello ' + ${name}">hello! empty</p>
</body>
</html>
```


![image-20210728144741912](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144741912.png)

그냥 주소창에 치면 에러가 뜬다.
![image-20210728144814579](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144814579.png)

에러내용: "name"값이 없다. name값을 넣어라

여기선 required 기본값이 true이기 때문에 무조건 값을 넘겨야한다.

어떻게 넘기느냐?

![image-20210728144831698](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144831698.png)

이렇게 get방식으로 주소창에 직접! ?name=~~~라고 친다.

그러면 그대로 나옴.


![image-20210728144908713](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144908713.png)

1.name이 spring이 됨.

2\. spring이란 name이 model에 담겨

3\. hello-template으로 리턴됨.

![image-20210728144952849](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728144952849.png)
템플릿파일에서 ${name}값이 spring으로 ..

모델에서 값을 꺼냄! 모델안의 spring이란 네임값을 꺼냄.

**MVC/템플릿엔진의 원리**

1.웹브라우저에서 localhost:8080/hello-mvc를 넘긴다.

2.스프링부트에서 내장톰켓서버를 먼저 거친다.

3.내장 톰켓서버는 받은 mvc를 스프링에게 던진다.

4.스프링은 컨트롤러에 매핑되어있는 메소드를 매칭해줌.

5.스프링이 viewResolver가 동작 (템플릿엔진 처리)

6\. 뷰리졸버가 템플릿츠에 헬로-템플릿을 찾아서 템플릿 엔진에게 처리하라고 넘기면

7.템플릿 엔진에 변환한 html을 웹 브라우저에 넘긴다.

## **3)API**

![image-20210728145012476](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145012476.png)
주소창에 "http://localhost:8080/hello-string?name=spring!!!" 검색

![image-20210728145033251](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145033251.png)

결과창


![image-20210728145134031](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145134031.png)
페이지 소스에도 html코드 하나 없이 데이터가 그대로 나옴.


![image-20210728145210742](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145210742.png)
주소창에 "http://localhost:8080/hello-api?name=spring!!!"  검색

![image-20210728145307553](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145307553.png)

결과화면


{"name" : "spring!!!"} --> json형식으로 출력됨

{ key  : value }

html은 태그를 열고 닫고 해야하는데 json은 { key  : value } 로 간단하다.

그래서 요즘은 json방식을 많이 선호한다.

**@ResponseBody 를 사용원리**

: 문자열이라면 그대로 넘기겠지만 객체가 오면 기본 디폴트가 제이슨방식으로 데이터를 만들어서 반환한다.

-   HTTP의 BODY에 문자 내용을 직접 반환
-   viewResolver 대신에 HttpMessageConverter 가 동작
-   기본 문자처리: StringHttpMessageConverter
-   기본 객체처리: MappingJackson2HttpMessageConverter (Jackson이라는 라이브러리로 Json형식으로 바꾼다)
-   byte 처리 등등 기타 여러 HttpMessageConverter가 기본으로 등록되어 있음

---

#### **\[정리\]**

-   정적컨텐츠: 그냥 파일을 그대로 내려준다.
-   MVC와 템플릿 엔진 : 템플릿 엔진을 모델 뷰 컨트롤러 방식으로 쪼개서 뷰를 템플릿 엔진으로 렌더링한 후 렌더링 된 html을 고객에게 전달
-   API: 뷰 없이 제이슨 형식으로 객체반환


#4. 회원관리 예제 - 백엔드 개발
-   비즈니스 요구사항 정리
-   회원 도메인과 리퍼지토리 만들기
-   회원 리퍼지토리 테스트 케이스 작성
-   회원 서비스 개발
-   회원 서비스 테스트

**1) 비즈니스 요구사항 정리**

-   데이터 : 회원ID, 이름
-   기능 :  회원등록, 조회
-   아직 데이터 저장소가 선정되지 않음(가상의 시나리오)

![image-20210728145508913](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145508913.png)

-   컨트롤러: 웹 MVC의 컨트롤러 역할
-   서비스: 비즈니스 도메인을 가지고 핵심 비즈니스 로직 구현 (예: 회원은 중복가입이 안된다)
-   리포지토리: 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리
-   도메인: 비즈니스 도메인 객체, 예) 회원, 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리됨

아직 데이터 저장소가 선정되지 않아서, 우선 인터페이스로 구현 클래스를 변경할 수 있도록 설계  
데이터 저장소는 RDB, NoSQL 등등 다양한 저장소를 고민중인 상황으로 가정  
개발을 진행하기 위해서 초기 개발 단계에서는 구현체로 가벼운 메모리 기반의 데이터 저장소 사용

**2) 회원 도메인과 리퍼지토리 만들기**

![image-20210728145536096](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145536096.png)

hello.hellospring에 domain이라는 package를 만들고 그 안에 Member클래스를 만든다.

```
[Member Class]

package hello.hellospring.domain;

public class Member {

    private Long id; /*임의의 값.. 데이터를 구분하기 위해 시스템이 저장하는 아이디*/
    private String name; /*그냥 이름*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

데이터는 요구사항에서 설정한 것과 같이 이름과 아이디.

아이디는 고객이 설정하는 것이 아닌 데이터를 구분하기 위해 임의로 시스템이 설정하는 값.

게터/세터 생성

![image-20210728145604557](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145604557.png)

repository에 MemberRepository 인터페이스를 만든다.

```
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
```

네가지 메소드를 만들었다.

save :회원이 저장소에 저장됨

findById, findByName : 저장소에서 id와 name값을 꺼내온다.

findAll: 저장소에 저장된 모든 값을 반환해준다.

이제 구현체를 만들어준다.

MemoryMemberRepository.java 파일 생성

```
package hello.hellospring.repository;

import hello.hellospring.domain.Member;

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
}
```

인터페이스 파일 임플리먼츠해줌.

메모리를 저장해야하니까 Map을 사용해줌.

키는 회원 아이디니까 Long, 값은 Member

long타입의 시퀀스도 만들어줌. 그냥 0,1,2...의 시퀀스를 생성해주는 역할

**3\. 회원 리포지토리 테스트 케이스 작성**

: 개발한 기능을 실행해서 테스트 할 때 자바의 main메서드를 통해 실행하거나,

웹 애플리케이션의 컨트롤러를 통해서 해당 기능을 실행한다.

이러한 방법은 준비하고 실행하는데 오래걸리고, 반복 실행하기 어려우며 여러 테스트를 한번에 실행하기 어렵다.

자바는 JUnit이라는 프레임워크로 테스트를 실행해서 이러한 문제를 해결한다.

src/test/java 하위폴더에 repository 패키지 생성 후 MemoryMemberRepositoryTest.java 파일을 생성한다.

![image-20210728145645258](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145645258.png)
```
package hello.hellospring.repository;

import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest { /*다른 애들을 갖다쓸게 아니기때문에 굳이 퍼블릭으로 만들지 않아도 된다.*/

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){

    }

}
```

**4\. 회원 서비스 개발**

회원 서비스는 회원리퍼지토리랑 도메인을 활용해서 실제 비즈니스 로직을 작성하는 클래스



#5. 회원 관리 예제 - 웹 MVC 개발
-   회원 웹 기능 - 홈 화면 추가
-   회원 웹 기능 - 등록
-   회원 웹 기능 - 조회

#### **1) 회원 웹 기능 - 홈화면 추가**

홈 컨트롤러 추가

![image-20210728145847207](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145847207.png)

```
package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") /* / : localhost:8080으로 들어오면 아래 메소드가 호출된다. */
    public String home(){
        return "home";
    }
}
```

회원관리용 홈 html 추가

![image-20210728145934535](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145934535.png)

```
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<div class="container">
    <div>
        <h1>Hello Spring</h1>
        <p>회원 기능</p>
        <p>
            <a href="/members/new">회원 가입</a>
            <a href="/members">회원 목록</a>
        </p>
    </div></div> <!-- /container -->
</body>
</html>
```

주소창에 localhost:8080 검색

![image-20210728145958936](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728145958936.png)

결과화면


\* 우리가 앞서 기본 화면으로 index.html이라는 정적파일을 만들어 놓았다.

주소를 쳤을 때 기본 화면으로 index.html이 아닌 **home.html**이 나오는 이유는

**컨트롤러가 정적파일보다 우선순위가 높기 때문**이다.

#### **2) 회원 웹 기능 - 등록**

회원등록 폼 개발

회원등록 폼 컨트롤러

![image-20210728150031592](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150031592.png)

```
package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController  {
    private  final MemberService memberService;
    /*new로 생성하지 않고 스프링 컨테이너에 등록을 한 후 사용한다*/

    @Autowired
    public MemberController(MemberService memberService) {

        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm"; /*여기로 이동.. 리턴하면 템플릿에서 찾는다.*/
    }


}
```

회원등록폼인 createMemberForm을 만들어줌.

createForm()메서드에서 return할때 "members/createMemberForm"을 템플릿에서 찾아서 이동한다.

회원 등록 폼 HTML

![image-20210728150050575](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150050575.png)

```
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org"><body>
<div class="container">
    <form action="/members/new" method="post">
        <div class="form-group">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" placeholder="이름을 입력하세요">
        </div>
        <button type="submit">등록</button>
    </form>
</div> <!-- /container -->
</body>
</html>
```

템플릿에 createMemberForm.html을 만들어줌.

뷰리졸버를 통해 얘가 선택되고 타임리프템플릿을 통해 화면에 뿌려진다.

회원등록 컨트롤러

웹등록 화면에서 데이터를 전달 받을 폼 객체

![image-20210728150116113](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150116113.png)

```
package hello.hellospring.controller;

public class MemberForm {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

웹 등록화면에 우리가 입력받을 값은 name.

name값을 전달 받을 객체를 생성해준다.

회원 컨트롤러에서 회원을 실제 등록하는 기능

```
    @PostMapping("/members/new") /* createMemberForm을 통해 멤버스 뉴의 포스트 방식으로 연결됨. 여기로 왔음*/
    public String create(MemberForm form){ /*create 메서드 호출됨*/
        Member member = new Member(); /*멤버폼으로 가서 셋 네임으로 아까 크레이트 폼에서 넣었던 네임값을 넣어준다.*/
        member.setName(form.getName()); /*폼에서 겟 네임으로 꺼내줌*/

        memberService.join(member);

        return "redirect:/";

    }
```

회원컨트롤러에 추가해줌.

createMemberForm에서 등록을 하면 action을 타고 members/new의 포스트방식인 여기로 create메서드로 연결이 된다.

(보통 데이터를 등록할 땐 post방식을 사용함)

멤버폼의 setName을 통해 아까 createMemberForm에서 넣었던 name값이 들어가게된다.

form에서 getName으로 값을 꺼내준다.

memberService의 join을 통해 member 가입 완료.

#### **3) 회원 웹 기능 - 조회 (회원 목록 동작)**

![image-20210728150148902](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150148902.png)

회원목록을 누르면 members로 가게 해놓았기 때문에 "@GetMapping(value = "/members")"라고 써줌

```
@GetMapping(value = "/members")
public String list(Model model) {
   List<Member> members = memberService.findMembers();
   model.addAttribute("members", members);
   return "members/memberList";
}
```

회원조회를 해준다.

findMembers()를 하면 모든 멤버를 조회할 수 있다.

조회한 데이터를 members라는 list에 담고 model에 통째로 담아줌.

"members/memberList"로 간다.

회원 리스트 HTML

![image-20210728150209274](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150209274.png)

```
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<div class="container">
  <div>
    <table>
      <thead> <tr>
        <th>#</th>
        <th>이름</th>
      </tr>
      </thead>
      <tbody>
      <tr th:each="member : ${members}">
        <td th:text="${member.id}"></td>
        <td th:text="${member.name}"></td>
      </tr>
      </tbody>
    </table>
  </div>
</div> <!-- /container -->
</body>
</html>
```

![image-20210728150231148](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150231148.png)

![image-20210728150249585](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150249585.png)

![image-20210728150316884](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150316884.png)

페이지 소스를 보면 내가 입력한 값이 2개 이기때문에 두가지가 랜더링 되어있지만 실제 코드에는 하나만 랜더링 되어있다.

이건 템플릿 언어로 "${ }"는 모델안의 값을 꺼내는 것이다.

![image-20210728150418105](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150418105.png)

컨트롤러에서 넘어갈때 model 안에 addAttribute로 "members"라는 키 안에 list로 모든 회원을 조회해서 members(값)을 담아놓았다.

그러고 html로 와서

![image-20210728150433729](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150433729.png)

첫번째 객체를 하나 꺼내서 member에 담는다.

얘의 id와 name을 출력한다.

이걸 입력된 데이터만큼 반복한다..

지금은 메모리에 데이터가 담겨있기때문에

서버를 껐다 켰을 시 모든 데이터가 날아간다.

그래서 데이터를 파일이나 데이터베이스에 저장해야한다.

그건 다음시간에 해 볼 것이다.

#6. 스프링 DB접근 기술
-   H2 데이터베이스 설치
-   순수 Jdbc
-   스프링 통합 테스트
-   스프링 JdbcTemplate
-   JPA
-   스프링 데이터 JPA

---

#### **1) H2 데이터베이스 설치**

: 개발이나 테스트 용도로 가법교 편리한 DB, 웹 화면 제공

![image-20210728150554874](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150554874.png)

파일 경로

사용자명/비밀번호 그대로 둠

연결하기!

JDBC URL

\- jdbc:h2:~/test (최초 한번)   ,    ~/test.mv.db 파일 생성 확인  
\- 이후부터는 jdbc:h2:tcp://localhost/~/test 이렇게 접속

---

테이블 생성하기

![image-20210728150640433](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150640433.png)

\- bigint(db) = long(java)

\- generated by default as identity : null값이 들어오면 자동으로 id값을 채워준다.

#### **2) 순수 JDBC (진짜로 DB에 넣고 빼기) - 구식버전**

환경설정

```
implementation 'org.springframework.boot:spring-boot-starter-jdbc'
runtimeOnly 'com.h2database:h2'
```

build.gradel에 jdbc,h2관련 드라이버를 추가해준다.

1\. 자바는 DB랑 붙을 때 이 jdbc 드라이버가 꼭 필요하다. 이걸 가지고 서로 연동함.

2\. DB랑 붙을 때 데이터베이스가 제공하는 클라이언트가 필요함.

application.properties에 경로 지정해줌.

![image-20210728150724447](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150724447.png)

h2접속 할때 썼던 url을 입력해줌.

![image-20210728150744801](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150744801.png)
![image-20210728150802016](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150802016.png)

build.gradle에 가서 코끼리 눌러주면 이거 뜸.

이거까지 설정해야 에러 안뜸.

이렇게 드라이버를 설정해준다.

이렇게 하면 데이터베이스에 접근하기 위한 준비 완료!

---

![image-20210728150855365](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150855365.png)

repository에 JdbcMemberRepository 클래스를 만들어주고 MemberRepository를 임플리먼츠 해준다.

```
package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public class JdbcMemberRepository implements  MemberRepository{

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
```

JdbcMemberRepository 작성

```
package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JdbcMemberRepository implements MemberRepository {
    private final DataSource dataSource;

    public JdbcMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Member save(Member member) {
        String sql = "insert into member(name) values(?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; /*결과를 받음*/


        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, member.getName());

            pstmt.executeUpdate();
            rs = pstmt.getGeneratedKeys();

            if (rs.next()) {
                member.setId(rs.getLong(1));
            } else {
                throw new SQLException("id 조회 실패");
            }
            return member;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } finally {
            close(conn, pstmt, rs); /*작업 끝나면 바로 연결 끊어주기*/
        }
    }

    @Override
    public Optional<Member> findById(Long id) {
        String sql = "select * from member where id = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                Member member = new Member();
                member.setId(rs.getLong("id"));
                member.setName(rs.getString("name"));
                return Optional.of(member);
            } else {
                return Optional.empty();
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } finally {
            close(conn, pstmt, rs);
        }
    }

    @Override
    public List<Member> findAll() {
        String sql = "select * from member";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            List<Member> members = new ArrayList<>();
            while (rs.next()) {
                Member member = new Member();
                member.setId(rs.getLong("id"));
                member.setName(rs.getString("name"));
                members.add(member);
            }
            return members;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } finally {
            close(conn, pstmt, rs);
        }
    }

    @Override
    public Optional<Member> findByName(String name) {
        String sql = "select * from member where name = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                Member member = new Member();
                member.setId(rs.getLong("id"));
                member.setName(rs.getString("name"));
                return Optional.of(member);
            }
            return Optional.empty();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } finally {
            close(conn, pstmt, rs);
        }
    }

    private Connection getConnection() {
        return DataSourceUtils.getConnection(dataSource);
    }

    private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                close(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void close(Connection conn) throws SQLException {
        DataSourceUtils.releaseConnection(conn, dataSource);
    }
}
```

DataSource는 데이터베이스 커넥션을 획득할 때 사용하는 객체다. 스프링 부트는 데이터베이스 커넥션  
정보를 바탕으로 DataSource를 생성하고 스프링 빈으로 만들어둔다. 그래서 DI를 받을 수 있다.

바로 실행하면 안됨.

![image-20210728150929227](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150929227.png)

우리는 지금까지 MemoryMemberRepository를 사용하고 있었다.

그렇기 때문에 SpringConfig로 가서 JdbcMemberRepository의 스프링빈으로 등록해준다.

![image-20210728150951586](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728150951586.png)

우리가 원래 사용했던 MemoryMemberRepository는 주석을 걸어놓고

JdbcMemberRepository를 스프링빈으로 추가해줌.

DB와 연결하려면 DataSource가 필요하기 때문에 스프링에게 제공받는다.

데이터베이스와 연결해주는 소스를 만들어주고 생성자를 만들어서 @Autowired걸어 DI해준다.

![image-20210728151008361](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151008361.png)

이렇게 스프링에게 제공받을 수 있다.

수정된 SpringConfig파일

```
package hello.hellospring.service;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean /*스프링 빈에 등록해라*/
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }


    @Bean
    public MemberRepository memberRepository(){
       //return new MemoryMemberRepository(); /*리퍼지토리는 인터페이스라 new가 안돼. 그래서 구현체인 얘를 new함*/
        return new JdbcMemberRepository(dataSource);
    }

}
```

다른 소스는 손보지 않고 SpringConfig만 수정하여 디비와 연결할 수 있다.

![image-20210728151036628](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151036628.png)

현재 DB 목록

![image-20210728151051984](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151051984.png)

목록 버튼 눌렀을 때

![image-20210728151105495](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151105495.png)

새로 가입해봄

![image-20210728151120892](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151120892.png)

회원목록

![image-20210728151135947](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151135947.png)

DB 업데이트!!

스프링을 왜 쓰나?

객체지향 적인 설계가 좋다.

왜? 다형성을 활용한다

인터페이스를 두고 구현체를 바꿔끼기 할 수 있다.

방금 JDBC리퍼지토리로 바꿔낀 것 처럼!

스프링은 이런걸 잘 활용할 수 있게 해준다.

원래는 멤버서비스코드를 JDBC서비스를 활용할 수 있게끔 코드를 하나하나 수정해야하는데

스프링은 스프링컨피그파일에서 스프링 빈만 바꿔주면 다르코드는 하나도 손 댈 게 없어서 편리하다는 말이다.

클래스구현이미지

![image-20210728151218510](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151218510.png)

멤버서비스는 멤버리포지토리에 의지하고있고

멤버리포지토리는 메모리와 JDBC리포지토리를 가지고 있다.

![image-20210728151238001](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151238001.png)

스프링설정을 하면서 메모리와의 연결은 끊어버리고 JDBC와만 연결할 수 있다.

-   개방-폐쇄 원칙(OCP, Open-Closed Principle)  
    확장에는 열려있고, 수정, 변경에는 닫혀있다.
-   스프링의 DI (Dependencies Injection)을 사용하면 **기존 코드를 전혀 손대지 않고, 설정만으로 구현**  
    **클래스를 변경할 수 있다.**
-   회원을 등록하고 DB에 결과가 잘 입력되는지 확인하자.

-   데이터를 DB에 저장하므로 스프링 서버를 다시 실행해도 데이터가 안전하게 저장된다.

#### **3) 스프링 통합 테스트**

스프링 컨테이너와 DB까지 연결한 통합 테스트를 진행해보자.

MemberServiceTest를 DB까지 연결된 테스트로 만들어보자

![image-20210728151327730](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151327730.png)

MemberServiceTest를 복사하여 MemberServiceIntegrationTest라는 이름으로 테스트 클래스를 생성한다.

![image-20210728151343066](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151343066.png)

스프링을 테스트할 땐 클래스이름 위에 @SpringBootTest라고 어노테이션을 걸어준다.

![image-20210728151357268](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151357268.png)

비포 에프터 메서드 삭제.

![image-20210728151419799](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151419799.png)

먼저 회원가입만 테스트를 해봄

![image-20210728151435622](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151435622.png)

테스트 OK

![image-20210728151448137](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151448137.png)

DB에도 잘 들어왔다.

이제 다시 한번 회원가입을 해보겠다.

![image-20210728151504564](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151504564.png)

이미 hello라는 회원이 존재하는데 똑같이 가입을 하니까 중복 에러가 남.

원래같으면 before/after해서 clear를 해주어야하지만

스프링에서는 @Transactional을 테스트케이스에 걸어준다.

이 애노테이션이 있으면, 테스트 시작 전에 트랜잭션을 시작하고, 테스트 완료 후에 항상 롤백한다.

이렇게 하면 DB에 데이터가 남지 않으므로 다음 테스트에 영향을 주지 않는다.

\->기존처럼 지우는 코드를 넣지 않아도 테스트 시작전에 데이터를 다 날리고 실행함.

매 테스트 마다 트렌젝션을 해주는 거야.

그래서 같은 테스트를 여러번 실행할 수 있다.

![image-20210728151520333](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151520333.png)

트렌젝셔널 걸어줌

![image-20210728151536155](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151536155.png)

계속해서 테스트를 진행할 수 있다.


#6. 스프링 DB접근 기술2
### 4) 스프링JDBCTemplate

-   순수 Jdbc와 동일한 환경설정을 하면 된다.

![image-20210728151705721](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151705721.png)

-   스프링 JdbcTemplate과 MyBatis 같은 라이브러리는 **JDBC API**에서 본  
    **반복 코드를 대부분** **제거해준다.   
    하지만 SQL은 직접 작성해야 한다.**

JdbcTemplateMemberRepository.java 생성

![image-20210728151834803](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151834803.png)

MemberRepository implements해주고

JdbcTemplate 생성해줌

JdbcTemplate는 인젝션을 받을 수 있는 게 아니라서

생성자를 만든 후 dataSource를 인젝션 해준다.

참고로 **생성자가 하나** 일때는 @Autowired를 생략해도 된다.

![image-20210728151907377](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151907377.png)

![image-20210728151930387](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151930387.png)

![image-20210728151944504](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728151944504.png)

Alt+Enter (mac: Option+Enter)  -> replace with Ramda

![image-20210728152009007](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152009007.png)

![image-20210728152124684](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152124684.png)

아래의 rowMapper를 여기에 넣어주고

ctrl + Alt + V

![image-20210728152150923](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152150923.png)

result가 list로 나옴

result를 stream으로 바꿔서 findAny()해준다.

\-> jdbcTemplate에서 쿼리 날려서 그 결과를 memberRowMapper()를 통해 맵핑하고

맵핑한 값을 result라는 list로 받아서 Option으로 받아서 반환한다.

---

\[JDBC와 비교\]

JDBC

```
    @Override
    public Optional<Member> findById(Long id) {
        String sql = "select * from member where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery(); if(rs.next()) {
                Member member = new Member();
                member.setId(rs.getLong("id"));
                member.setName(rs.getString("name"));
                return Optional.of(member);
            } else {
                return Optional.empty();
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } finally {
            close(conn, pstmt, rs);
        }
    }
```

JDBCTemplate

```
    @Override/*id조회*/
    public Optional<Member> findById(Long id) {
        List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(),id);
        return result.stream().findAny();

    }
```

JDBC와 비교하였을 때 어마무지하게 긴 소스의 양을 단 세줄로 줄일 수 있다.

---

![image-20210728152218348](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152218348.png)

SimpleJdbcInsert는 그냥 tablename과 keycolumn만 넣으면 쿼리를 짤 필요가 없다.

실제로 테이블명과 컬럼명만 있으면 insert문을 만들 수 있잖아?

ex) insert into 테이블명 where 컬럼명=?

![image-20210728152336159](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152336159.png)

![image-20210728152422657](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152422657.png)

findAll은 list로 반환해 준 rs 결과를 memer객체로 맵핑을 한 다음에 return으로 돌려준다.

![image-20210728152456272](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152456272.png)

다 됐으면 SpringConfig에서

JdbcTemplateMemberRepository를 스프링빈으로 등록

![image-20210728152529204](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152529204.png)

test돌려보기!

test코드를 잘 짜는 것이 중요하다.

★jdbc -> jdbcTemplate으로 바꾸고 나니 반복되는 코드의 양이 확 줄었다.

### **5) JPA**

★ jdbcTemplate은 반복되는 코드의 양을 줄일 순 있지만 SQL문장을 직접 작성해야한다.

하지만 JPA는 SQL문장을 작성할 필요가 없다.

-   JPA는 기존의 반복 코드는 물론이고, **기본적인 SQL도 JPA가 직접 만들어서 실행**해준다.
-   JPA를 사용하면, SQL과 데이터 중심의 설계에서 **객체 중심의 설계로 패러다임을 전환**을 할 수 있다.
-   JPA를 사용하면 **개발 생산성을 크게 높일 수 있다**.

**build.gradle 파일에 JPA, h2 데이터베이스 관련 라이브러리 추가**

![image-20210728152618415](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152618415.png)

jpa를 사용하려면 build.gradle에서 data-jpa를 추가해야한다.

얘는 jpa와 jdbc를 모두 포함하는 라이브러리.

추가하고 gradel refresh!

라이브러리가 다운받아진다.

**스프링 부트에 JPA 설정 추가**

![image-20210728152700109](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152700109.png)

spring.jpa.show-sql=true       //jpa가 날리는 sql을 볼 수 있다.  
spring.jpa.hibernate.ddl-auto=none      //jpa를 사용하면 객체를 보고 얘가 알아서 테이블도 만든다. 근데 우린 테이블이 만들어져있고 그걸 사용할 거기 때문에 생성 기능을 끄고 시작하겠다.

테이블 생성을 원한다면 spring.jpa.hibernate.ddl-auto\=create

라이브러리가 다 받아졌다면

![image-20210728152722827](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152722827.png)

에 jpa와 hibernate가 모두 들어와 있어야 한다.

![image-20210728152740175](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152740175.png)

jpa는 인터페이스만 제공되는 것.

jpa는 표준 인터페이스이고 그 구현을 hibernate같은 업체들에서 하는 것이다.

jpa는 ORM이라는 기술인데

ORM이란 객체와 관계형 데이터 베이스의 테이블을 맵핑한다.

Object

Relational

Mapping

**JPA 엔티티 매핑**

![image-20210728152758441](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152758441.png)

jpa를 사용하기 위해 클래스명 위에 @Entity를 걸어준다.

그리고 pk를 맵핑시켜주어야 하는데

![image-20210728152814224](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152814224.png)

우리가 디비에서 name값을 넣었을 때 id값이 저절로 생성된다.

이런 걸 아이덴티티전략이라고 한다.

그래서 strategy에 IDENTITY라고 써준다.

**JPA 회원 리포지토리**

```
package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    private  final EntityManager em; /*jpa는 EntityManager라는 것으로 모든게 동작한다 */

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
```

EntityManager? jpa는 EntityManager라는 것으로 모든게 동작한다

build.gradle에 data-jpa 라이브러리를 다운 받는 순간 스프링 부트는 자동으로 EntityManager를 생성해준다.우리는 만들어진 EntityManager를 인젝션 받으면 된다.※ JPA를 사용하려면 EntityManager를 주입받아야한다.

```
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
```

\- 저장 : em.persist()\- id 조회 : em.find(조회할 타입, 식별자pk값)   ------   id는 pk(primary key)라서\- name 조회 : em.createQuery()   ------   jpql이라는 객체지향 쿼리문을 써야한다.

![image-20210728152845289](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152845289.png)
![image-20210728152908860](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152908860.png)

![image-20210728152933750](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728152933750.png)
\-> inline..

inline을 쓰는 이유? 함수의 호출 과정을 거치지 않고, 함수의 모든 코드를 호출된 자리에 바로 삽입하는 방식의 함수입니다.

> "select m from Member m"  
> \> jqpl이라는 쿼리 언어 : 테이블이 아닌 객체(@Entity) 대상으로 쿼리를 날린다. <  
> Member m = member를 m이라고 부르겠다.  
> 원래의 sql의 경우에는 select \* from~~ value이르면서 다 적고 ? 해서 하나하나 맵핑해야한다.  
> 하지만 얘는 그냥 select(조회)하는데 member객체 자체를 select(조회)한다. 그러면 끝!
>
> ---
>
> findByName():  
> "select m from Member m where m.name= :name"

**서비스 계층에 트랜잭션 추가**

```
import org.springframework.transaction.annotation.Transactional
@Transactional
public class MemberService {}
```

-   JPA를 사용하려면 항상 트랜잭션이 있어야한다. (데이터를 저장하거나 변경할 때)
-   스프링은 해당 클래스의 메서드를 실행할 때 트랜잭션을 시작하고, 메서드가 정상 종료되면 트랜잭션을  
    커밋한다. 만약 런타임 예외가 발생하면 롤백한다.
-   JPA를 통한 모든 데이터 변경은 트랜잭션 안에서 실행해야 한다.

**JPA를 사용하도록 스프링 설정 변경**

![image-20210728153006478](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153006478.png)

![image-20210728153019429](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153019429.png)

Test 성공!

![image-20210728153033081](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153033081.png)

application.properties에서 spring.jpa.show-sql\=true를 추가해줬잖아.

그래서 여기서 sql문장을 볼 수 있다.

### **6) 스프링 데이터 JPA**

스프링 데이터 JPA를 사용하면, 기존의 한계를 넘어 마치 마법처럼, 리포지토리에 구현 클래스 없이  
인터페이스 만으로 개발을 완료할 수 있습니다. 그리고 반복 개발해온 기본 CRUD 기능도 스프링 데이터  
JPA가 모두 제공합니다.

실무에서 관계형 데이터베이스를 사용한다면 스프링 데이터 JPA는 이제 선택이 아니라 필수 입니다.

\> 주의: 스프링 데이터 JPA는 JPA를 편리하게 사용하도록 도와주는 기술입니다. 따라서 JPA를 먼저 학습한  
후에 스프링 데이터 JPA를 학습해야 합니다.

\> 앞의 JPA 설정을 그대로 사용한다.

**스프링 데이터 JPA 회원 리포지토리**

```
package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository  { 

    @Override
    Optional<Member> findByName(String name);
}
```

스프링데이터 인터피에스를 만들고

JpaRepository 인터페이스를 받는다.

인터페이스에 인터페이스를 받을 땐 implements가 아닌 extends를 사용한다.

우리가 만든 MemberRepository도 넣는다. <key, id의 타입>

그리고 findByName()만 오버라이딩 해주면 끝.

**스프링 데이터 JPA 회원 리포지토리를 사용하도록 스프링 설정 변경**

```
   private  final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean /*스프링 빈에 등록해라*/
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }
```

스프링 데이터 JPA가 SpringDataJpaMemberRepository 를 스프링 빈으로 자동 등록해준다.

**HOW?**

![image-20210728153107602](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153107602.png)

JpaRepository와 CrudRepository에 가보면

![image-20210728153136617](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153136617.png)

이런식으로 기본적인 crud와  단순 조회메소드를 쭉 제공해준다.

그래서 그런건 그냥 가져다 쓰면 된다.

하지만 저것들은 모두에게 통용되는 메소드다.

하지만 이름을 찾는다거나 나이로 찾는다거나~

~~로 찾는다는 건 공통적으로 통용될 수 없다.-

\-> findByName은 못 만든대.

그래서 스프링데이터JPA에 등록을 해주면

![image-20210728153150660](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153150660.png)

이런식으로 알아서 jpql을 짠다.

이게 sql로 번역되어서 실행되는 것이다.

이런식으로 인터페이스 이름만으로 개발을 끝낼 수 있다.

**스프링 데이터 JPA 제공 기능**  
1\. 인터페이스를 통한 기본적인 CRUD  
2\. findByName() , findByEmail() 처럼 메서드 이름 만으로 조회 기능 제공  
3\. 페이징 기능 자동 제공


#7. AOP
#### **AOP는 언제 쓰는가?**

-   모든 메소드의 호출 시간을 측정하고 싶다면?
-   공통 관심 사항(cross-cutting concern) vs 핵심 관심 사항(core concern)
-   회원 가입 시간, 회원 조회 시간을 측정하고 싶다면?

**MemberService 회원 조회 시간 측정 추가**

![image-20210728153306215](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153306215.png)
![image-20210728153318797](C:\Users\heeseon\AppData\Roaming\Typora\typora-user-images\image-20210728153318797.png)

원래는 이렇게 하나하나 다 추가해서 시간조회를 해주어야 한다.

\* 문제 \*

-   회원가입, 회원 조회에 시간을 측정하는 기능은 핵심 관심 사항이 아니다.
-   시간을 측정하는 로직은 공통 관심 사항이다.
-   시간을 측정하는 로직과 핵심 비즈니스의 로직이 섞여서 유지보수가 어렵다.
-   시간을 측정하는 로직을 별도의 공통 로직으로 만들기 매우 어렵다.
-   시간을 측정하는 로직을 변경할 때 모든 로직을 찾아가면서 변경해야 한다.

이러한 문제를 해결하기 위한 프로그램을 AOP라고 한다.

---

#### **AOP적용 (AOP: Aspect Oriented Programming)**

: 공통관심사항과 핵심관심사항을 분리하는 것!
![image-20210728160437612](https://raw.githubusercontent.com/heeseonyang/hello-spring/master/img/image-20210728160437612.png)
mage/timeTraceAop에 모아놓고 필요할때마다 쓴다.

