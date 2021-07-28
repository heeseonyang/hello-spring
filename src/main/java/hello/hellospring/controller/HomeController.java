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
