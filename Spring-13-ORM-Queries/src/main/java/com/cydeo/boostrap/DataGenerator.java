package com.cydeo.boostrap;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository13;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository13 regionRepository;
    private final DepartmentRepository departmentRepository;

    public DataGenerator(RegionRepository13 regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-----------------REGION START--------------------");

        System.out.println(regionRepository.findByCountry("Canada"));
        System.out.println(regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContaining("United"));
        System.out.println(regionRepository.findByCountyContainigOrderByCountry("Asia"));
        System.out.println(regionRepository.findTop2ByCountry("Canada"));



        System.out.println("-----------------REGION ENDS--------------------");

        System.out.println(departmentRepository.findByDepartment("Toys"));


    }
}
