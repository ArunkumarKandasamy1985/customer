package com.commercial.customer.contracts;

import com.commercial.customer.pojo.CustomerPojo;

public interface CustomerContract {

	public CustomerPojo getCustomerDetails(String custId);
}
