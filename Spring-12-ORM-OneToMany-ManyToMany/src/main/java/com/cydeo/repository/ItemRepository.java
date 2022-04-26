package com.cydeo.repository;

import com.cydeo.entity.Item;
import jdk.jshell.execution.LoaderDelegate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
