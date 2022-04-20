package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity {

    private String department;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }

    private String division;
    @OneToOne(mappedBy = "department")
    private Employee employee;
}
