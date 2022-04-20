package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Employee;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.employeeRepository = employeeRepository;
    }

    EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {



        Car c1=new Car("BMW","M5");
        Car c2=new Car("Honda","Accord");
        Car c3=new Car("GMC","Y");
        Car c4=new Car("BMW","M5");
        Car c5=new Car("BMW","M5");
        Car c6=new Car("BMW","M5");

        carRepository.save(c1);
    }

}
