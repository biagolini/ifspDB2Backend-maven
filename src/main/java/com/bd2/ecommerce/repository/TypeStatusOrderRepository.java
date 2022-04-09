package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.TypeGenre;
import com.bd2.ecommerce.entity.TypeStatusOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeStatusOrderRepository extends JpaRepository<TypeStatusOrder,Long> {

    @Query(value = "SELECT a FROM TypeStatusOrder a WHERE a.isActive = true")
    List<TypeStatusOrder> findAll();
}
