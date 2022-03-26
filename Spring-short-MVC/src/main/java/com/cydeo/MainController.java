package com.cydeo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
   @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/employees") public String employees(Model model){
       model.addAttribute("name","Test");
       return "employee";
    }
}
