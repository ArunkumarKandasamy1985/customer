package com.commercial.customer.contracts;

import java.util.concurrent.ExecutionException;

import com.commercial.customer.pojo.CustomerPojo;

public interface CustomerContract {

	public CustomerPojo getCustomerDetails(String custId) throws ExecutionException, InterruptedException;
}
