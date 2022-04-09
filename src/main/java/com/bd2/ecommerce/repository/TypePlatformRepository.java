package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.TypePlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypePlatformRepository extends JpaRepository<TypePlatform,Long> {

    @Query(value = "SELECT a FROM TypePlatform a WHERE a.isActive = true")
    List<TypePlatform> findAll();

}
