package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Regions {
    @Id
    private Long id;
    private String region;
    private String country;

  // @OneToMany(mappedBy = "departments")
// private List<Employees> employees;

}
