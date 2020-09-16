package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    @RequestMapping(value = {"home.html","","/","index.html"})
    public String index(){
        return "home.index";
    }
}
