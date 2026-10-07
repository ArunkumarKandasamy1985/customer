package com.commercial.customer.services;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.commercial.customer.contracts.CustomerContract;
import com.commercial.customer.model.Customer;
import com.commercial.customer.pojo.CustomerPojo;
import com.commercial.customer.repository.CustomerRepository;

@Service
public class CustomerServices implements CustomerContract {

	Logger logger = LoggerFactory.getLogger(CustomerServices.class);

	private final CustomerRepository customerRepository;

	public CustomerServices(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public String saveCustomerDetails(Customer customer) {
		customerRepository.save(customer);
		return "Customer is saved successfully";
	}

	public CustomerPojo getCustomerDetails(String custId) throws ExecutionException, InterruptedException {

		CompletableFuture<CustomerPojo> completableFuture = CompletableFuture.supplyAsync(() -> {

			CustomerPojo customerPojo = null;
			Customer customer = customerRepository.findByCustomerId(custId);
			if (customer != null && !ObjectUtils.isEmpty(customer)) {
				customerPojo = new CustomerPojo();
				BeanUtils.copyProperties(customer, customerPojo);
			}
			logger.info("Thread from global: {}",Thread.currentThread().getName());
			logger.info("Copy Customer to Pojo: {}", customerPojo);
			return customerPojo;

		});
		return completableFuture.get();
	}

}