package com.cydeo.repository;

import com.cydeo.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Departments, String> {
    List<Departments> findByDepartment(String department);

}
