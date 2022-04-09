package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Long> {
}
