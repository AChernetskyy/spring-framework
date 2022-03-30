package com.cydeo.controller;

import com.cydeo.model.Employee;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
   @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/employees") public String employees(Model model){
        List<Employee>employeeList= new ArrayList<>();
        Faker faker = new Faker();
        employeeList.add(new Employee(faker.name().firstName(), faker.name().lastName(), faker.number().randomDigit()));
        employeeList.add(new Employee(faker.name().firstName(), faker.name().lastName(), faker.number().randomDigit()));
        employeeList.add(new Employee(faker.name().firstName(), faker.name().lastName(), faker.hashCode()));
        employeeList.add(new Employee(faker.name().firstName(), faker.name().lastName(), faker.hashCode()));

       model.addAttribute("name","Test");
       model.addAttribute("employeeList",employeeList);
       return "employee";
    }

    @RequestMapping("/employee-info")
    public String emplInfo(Model model){
        Employee emp1 = new Employee("Anton","Jack", 2000);
       model.addAttribute("emp", emp1);

       return "employee-info";
    }
}
