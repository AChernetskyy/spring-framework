package com.cydeo.repository;

import com.cydeo.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Regions, String> {
}
