package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("/new")
    public String getInfo(@RequestParam(required = false, defaultValue = "Test") String firstName, Model model){
        model.addAttribute("firstName",firstName);
        return "register";
    }

    @RequestMapping("/add/{firstName}")
    public String addInfo(@PathVariable String firstName, Model model){
        model.addAttribute("firstName", firstName);
        return "register";

    }
}
