package com.commercial.customer.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CustomerPojo {

	private String customerId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phoneNumber;
	
	private String DOB;
	
	private String gender;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String pincode;
	
	private String createdAt;
	
	private String updatedAt;
	
	private String status;
}
