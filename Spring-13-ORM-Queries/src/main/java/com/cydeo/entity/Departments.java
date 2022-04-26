package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Departments {
    @Id
    private String department;
    private String division;


    @OneToMany(mappedBy = "departments")
    private List<Employees> employees;
}
