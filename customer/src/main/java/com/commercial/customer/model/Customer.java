package com.commercial.customer.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "date_of_birth")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private String DOB;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "pincode")
	private String pincode;
	
	@CreationTimestamp
	@DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss")
	@Column(name = "created_at", nullable = false, updatable = false)
	private String createdAt;
	
	@UpdateTimestamp
	@DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss")
	@Column(name = "updated_at")
	private String updatedAt;
	
	@Column(name = "status")
	private String status;
		     
}
