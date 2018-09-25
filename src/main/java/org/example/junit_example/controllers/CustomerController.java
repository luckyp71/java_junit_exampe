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

	public static void main (String[] args) {
		CustomerController customerController = new CustomerController();
		customerController.addCustomer("Customer 1","Address 1");	
		Customer customer = customerController.getCustomer();
		
		System.out.println("Customer Name: "+customer.getName()+"\nCustomer Address: "+customer.getAddress());
	}
}
