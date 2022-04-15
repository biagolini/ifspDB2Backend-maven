package com.bd2.ecommerce.service;

import com.bd2.ecommerce.dto.CustomerForm;
import com.bd2.ecommerce.entity.Customer;
import com.bd2.ecommerce.entity.TypeState;
import com.bd2.ecommerce.repository.CustomerRepository;
import com.bd2.ecommerce.repository.TypeStateRepository;
import com.bd2.ecommerce.repository.specifications.CustomerSpecification;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final TypeStateRepository typeStateRepository;

    public Page<Customer> findAll(Pageable pageable) {
        return this.customerRepository.findAll(CustomerSpecification.isActive(),pageable);
    }

    public Page<Customer> findAll(Pageable pageable, String query) {
        return this.customerRepository.findAll(CustomerSpecification.likeGenericQuery(query),pageable);
    }

    public Page<Customer> findAll(Pageable pageable, String firstName, String lastName, String email, String cpf) {
        return this.customerRepository.findAll(CustomerSpecification.likeDescription(firstName, lastName, email, cpf),pageable);
    }


    public void  createCustomer(CustomerForm form) {
        Optional<Customer> conflictTestEmail = customerRepository.findCustomeByEmail(form.getEmail());
        Optional <Customer> conflictTestUserName = customerRepository.findCustomeByUsername(form.getUsername());
        if(conflictTestEmail.isPresent()||conflictTestUserName.isPresent() ) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        typeStateRepository.findById(form.getState()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Customer newRegister = new Customer(form);
        customerRepository.save(newRegister);
    }

    public void updateCustomer(Long id, CustomerForm form) {
        Optional <Customer> conflict = customerRepository.findConflict(form.getUsername(),form.getEmail(),id);
        if(conflict.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        typeStateRepository.findById(form.getState()).orElseThrow(() ->  new ResponseStatusException(HttpStatus.BAD_REQUEST,"State not found"));

        Customer customer = customerRepository.findCustomerById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        customer.update(form);

    }

    public void inactiveCustomer(Long id) {
        Customer customer = customerRepository.findCustomerById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        customer.setIsActive(false);
        customerRepository.save(customer);
    }


}
