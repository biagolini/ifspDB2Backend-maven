package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.TypeState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeStateRepository extends JpaRepository<TypeState,Long> {

    @Query(value = "SELECT a FROM TypeState a WHERE a.isActive = true")
    List<TypeState> findAll();
}
