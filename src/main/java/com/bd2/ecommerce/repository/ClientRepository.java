package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
