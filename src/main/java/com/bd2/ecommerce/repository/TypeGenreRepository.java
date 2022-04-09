package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.TypeGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeGenreRepository  extends JpaRepository<TypeGenre,Long>  , JpaSpecificationExecutor<TypeGenre> {

    @Query(value = "SELECT a FROM TypeGenre a WHERE a.isActive = true")
    List<TypeGenre> findAll();
}
