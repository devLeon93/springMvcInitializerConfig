package md.leonidbars.sprincmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String sayHello(){
        return "index";
    }

}
