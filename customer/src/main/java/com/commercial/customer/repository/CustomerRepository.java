package com.commercial.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commercial.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findByCustomerId(String custId);
}
