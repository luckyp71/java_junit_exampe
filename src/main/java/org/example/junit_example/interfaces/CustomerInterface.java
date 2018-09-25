package org.example.junit_example.interfaces;

import org.example.junit_example.models.Customer;

public interface CustomerInterface {
	
	//Get customer
	public Customer getCustomer();
	
	//Add customer
	public String addCustomer(String name, String address);
	
}
