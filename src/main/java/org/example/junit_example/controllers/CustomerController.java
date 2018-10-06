package org.example.junit_example.controllers;

import org.example.junit_example.models.Customer;
import org.example.junit_example.interfaces.CustomerInterface;

public class CustomerController implements CustomerInterface {

	private Customer customer = null;
	
	@Override
	public String addCustomer(String name, String address) {
		this.customer = new Customer(name, address);
		return "Success";
	}

	@Override
	public Customer getCustomer() {
		return this.customer;
	} 
}
