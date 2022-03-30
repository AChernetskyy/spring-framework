package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
}
