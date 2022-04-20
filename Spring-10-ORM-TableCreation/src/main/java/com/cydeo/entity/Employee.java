package com.cydeo.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "studentName")
    private String name;

    @Transient
    private String city;
}
