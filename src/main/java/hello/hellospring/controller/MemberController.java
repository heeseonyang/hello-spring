package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @PostMapping("/members/new") /* createMemberForm을 통해 멤버스 뉴의 포스트 방식으로 연결됨. 여기로 왔음*/
    public String create(MemberForm form){ /*create 메서드 호출됨*/
        Member member = new Member(); /*멤버폼으로 가서 셋 네임으로 아까 크레이트 폼에서 넣었던 네임값을 넣어준다.*/
        member.setName(form.getName()); /*폼에서 겟 네임으로 꺼내줌*/

        memberService.join(member);

        return "redirect:/";

    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);

        return "members/memberList";
    }


}
