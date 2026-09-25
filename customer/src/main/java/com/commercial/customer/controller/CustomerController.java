package com.commercial.customer.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.commercial.customer.model.Customer;
import com.commercial.customer.pojo.CustomerPojo;
import com.commercial.customer.services.CustomerServices;

@RestController
@RequestMapping("/rest/customer")
public class CustomerController {
	
	private CustomerServices customerServices;
	
	public CustomerController(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}

	@PostMapping("/save")
	public String saveCustomerDetails(@RequestBody Customer customer) {
		return customerServices.saveCustomerDetails(customer);
	}
	
	@GetMapping("/details")
	public CustomerPojo getCustomerDetails(@RequestParam("custId") String custId) throws ExecutionException, InterruptedException {
		return customerServices.getCustomerDetails(custId);
	}
}
