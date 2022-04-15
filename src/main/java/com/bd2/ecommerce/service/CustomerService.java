package com.bd2.ecommerce.service;

import com.bd2.ecommerce.entity.Customer;
import com.bd2.ecommerce.repository.CustomerRepository;
import com.bd2.ecommerce.repository.specifications.CustomerSpecification;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Page<Customer> findAll(Pageable pageable) {
        return this.customerRepository.findAll(CustomerSpecification.isActive(),pageable);
    }

    public Page<Customer> findAll(Pageable pageable, String query) {
        return this.customerRepository.findAll(CustomerSpecification.likeGenericQuery(query),pageable);
    }

    public Page<Customer> findAll(Pageable pageable, String firstName, String lastName, String email, String cpf) {
        return this.customerRepository.findAll(CustomerSpecification.likeDescription(firstName, lastName, email, cpf),pageable);
    }



}
