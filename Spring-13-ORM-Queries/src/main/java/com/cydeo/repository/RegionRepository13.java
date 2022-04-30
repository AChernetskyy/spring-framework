package com.cydeo.repository;

import com.cydeo.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository13 extends JpaRepository<Regions, Long> {
    List<Regions> findByCountry(String country);
    List<Regions> findDistinctByCountry(String county);
    List<Regions>findByCountryContaining(String county);
    List<Regions>findByCountyContainigOrderByCountry(String country);
    List<Regions>findTop2ByCountry(String county);
}
