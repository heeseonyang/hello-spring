1. 스프링 부트 시작하기 (SpringBoot 환경설정)


\-스프링부트란?

: 스프링 프레임워크를 복잡한 설정없이 쉽고 빠르게 사용할 수 있게 도와주는 라이브러리이다.

\-프로젝트 환경설정

1\. 스프링 부트 스타터 사이트로 이동해서 스프링 프로젝트 생성

(스프링 부트 기반으로 스프링 관련 프로젝트를 만들어주는 사이트)

\-> [http://start.spring.io](http://start.spring.io)

[##_Image|kage@Hiczl/btq97m6ZpXt/UuMpS39bfKsAktiOrKVk2k/img.jpg|alignCenter|data-origin-width="822" data-origin-height="880" data-filename="1.jpg" data-ke-mobilestyle="widthOrigin"|||_##]

위의 설정대로 프로젝트를 생성함.

[##_Image|kage@oTY9d/btq96EGNIMb/wq7iYJSx4R2gVK3ScUwKKK/img.png|alignCenter|data-origin-width="489" data-origin-height="303" data-ke-mobilestyle="widthOrigin"|||_##][##_Image|kage@IGN7s/btq9Y6LP59E/2FejEiWqVKjn7jRD8UIcK1/img.png|alignCenter|data-origin-width="615" data-origin-height="600" data-ke-mobilestyle="widthOrigin"|||_##]

처음 임포트 할땐 라이브러리를 수십메가를 다운받기때문에 반드시 네트워크 연결이 되어있어야 하고 로딩이 오래걸린다.

[##_Image|kage@nKxqf/btq97nEOdfV/cP3rYpqtF83IhqWizW3jQK/img.png|alignCenter|data-origin-width="462" data-origin-height="289" data-ke-mobilestyle="widthOrigin"|||_##]

요즘은 이렇게 main과 test로 나뉘어서 들어오는데

main의 java 밑에 실제 실행파일이 들어있고

test 안에는 test코드가 들어있다.

그만큼 요즘 test코드가 중요해졌다는 뜻이다.

자바파일을 제외한 나머지 환경설정파일 같은 것들은 resources

버전설정하고 라이브러리 땡겨오는 역할

[##_Image|kage@cUXUhb/btq91qb0gqL/t1KX0jr4emaPo0rsRm1CEK/img.png|alignCenter|data-origin-width="1156" data-origin-height="553" data-ke-mobilestyle="widthOrigin"|||_##]