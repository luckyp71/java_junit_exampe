package org.example.junit_example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.example.junit_example.controllers.CustomerController;
import org.example.junit_example.models.Customer;


public class CustomerControllerTest {
	
	private CustomerController custController = new CustomerController();
	
	//Test add customer
	@Test
	public void testAddCustomer() {
		String expectedResult = "Success";
		String actualResult = custController.addCustomer("Customer 2", "Address 1");
		assertEquals(expectedResult, actualResult);
	}
	
	//Test get customer
	@Test
	public void testGetCustomer() {
		custController.addCustomer("Customer 1", "Address 1");
		Customer expectedResult = new Customer("Customer 1", "Address 1");
		Customer actualResult = custController.getCustomer();

		assertEquals(expectedResult.getName(), actualResult.getName());
	}
}