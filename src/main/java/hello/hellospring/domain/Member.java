package hello.hellospring.domain;

import javax.persistence.*;

@Entity /*jpa가 관리하는 entity이다*/
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) /*pk맵핑,,pk는 db에서 값을 생성해준다?*/
    private Long id; /*임의의 값.. 데이터를 구분하기 위해 시스템이 저장하는 아이디*/

    @Column(name="name")
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
