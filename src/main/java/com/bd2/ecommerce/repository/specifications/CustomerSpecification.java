package com.bd2.ecommerce.repository.specifications;


import com.bd2.ecommerce.entity.Customer;
import com.bd2.ecommerce.entity.Customer_;
import org.springframework.data.jpa.domain.Specification;

public class CustomerSpecification {

    public static Specification<Customer> likeFirstName(String firstName) {
        if (firstName == null) {
            return null;
        }
        return (root, query, cb) -> {
            return cb.like(root.get(Customer_.FIRST_NAME), "%" + firstName + "%");
        };
    }

    public static Specification<Customer> likeLastName(String lastName) {
        if (lastName == null) {
            return null;
        }
        return (root, query, cb) -> {
            return cb.like(root.get(Customer_.LAST_NAME), "%" + lastName + "%");
        };
    }

    public static Specification<Customer> equalEmail(String email) {
        if (email == null) {
            return null;
        }
        return (root, query, cb) -> {
            return cb.equal(root.get(Customer_.EMAIL), email);
        };
    }

}
