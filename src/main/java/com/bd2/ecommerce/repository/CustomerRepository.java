package com.bd2.ecommerce.repository;

import com.bd2.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>, JpaSpecificationExecutor<Customer> {

    @Query("SELECT a FROM Customer a WHERE a.id = :id AND a.isActive = true")
    Optional<Customer> findCustomerById(Long id);

    @Query("SELECT a FROM Customer a WHERE a.username = :username AND a.isActive = true")
    Optional<Customer> findCustomeByUsername(String username);

    @Query("SELECT a FROM Customer a WHERE a.email = :email AND a.isActive = true")
    Optional<Customer> findCustomeByEmail(String email);


    @Query(value = "SELECT a FROM Customer a WHERE (a.username = :username OR a.email = :email) AND  a.id <> :id AND a.isActive = true")
    Optional<Customer> findConflict(String  username, String email, Long id);

}
