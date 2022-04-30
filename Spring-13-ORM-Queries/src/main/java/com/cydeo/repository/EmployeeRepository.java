package com.cydeo.repository;

import com.cydeo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {
    //Display all employees with email address ' '
    List<Employees> findByEmail(String email);

    //Display all employees with first name ' ' and last name ' ' , also show all employees with an email address
    List<Employees> findByFirstNameAndLastNameOrEmail(String firstName,String lastName,String email);

    //Display all employees that first name is not ' '
    List<Employees> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ' '
    List<Employees> findByLastNameStartsWith(String pattern);

    //Display all employees with salaries higher than ' '
    List<Employees> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ' '
    List<Employees> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between '' and  ''
    List<Employees> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to '' in order
    List<Employees> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ''
    List<Employees> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employees> findByEmailIsNull();


    @Query("SELECT e FROM Employees e WHERE e.email = 'sdubber7@t-online.de'")
    Employees getEmployeeDetail();

    @Query("SELECT e.salary FROM Employees e WHERE e.email = 'sdubber7@t-online.de'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employees e WHERE e.email=?1")
    Optional<Employees> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employees e WHERE e.email=?1 AND e.salary=?2")
    Employees getEmployeeDetail(String email,int salary);

    //Not Equal
    @Query("SELECT e FROM Employees e WHERE e.salary<>?1")
    List<Employees>getEmployeeSalaryNotEqual(int salary);

    @Query("SELECT e FROM Employees e WHERE e.firstName LIKE ?1")
    List<Employees>getEmployeeFirstNameLike(String pattern);

    //less than
    @Query("SELECT e FROM Employees e WHERE e.salary < ?1")
    List<Employees> getEmployeeSalaryLessThan(int salary);

    //greater than
    @Query("SELECT e FROM Employees e WHERE e.salary > ?1")
    List<Employees> getEmployeeSalaryGreaterThan(int salary);

    //Before
    @Query("SELECT e FROM Employees e WHERE e.hireDate > ?1")
    List<Employees> getEmployeeHireDateBefore(LocalDate date);

    //Between
    @Query("SELECT e FROM Employees e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employees> getEmployeeSalaryBetween(int salary1,int salary2);

    //Null
    @Query("SELECT e FROM Employees e WHERE e.email IS NULL")
    List<Employees> getEmployeeEmailIsNull();

    //Not Null
    @Query("SELECT e FROM Employees e WHERE e.email IS NOT NULL")
    List<Employees> getEmployeeEmailIsNotNull();

    //Sorting in ascending order
    @Query("SELECT e FROM Employees e ORDER BY e.salary")
    List<Employees> getEmployeeSalaryOrderAsc();

    //Sorting in descending order
    @Query("SELECT e FROM Employees e ORDER BY e.salary DESC ")
    List<Employees> getEmployeeSalaryOrderDesc();


    @Query(value = "SELECT * FROM employees WHERE salary ?1",nativeQuery = true)
    List<Employees> readEmployeeDetailBySalary(int salary);



}
