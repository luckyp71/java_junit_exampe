package org.example.junit_example.main;

import org.example.junit_example.controllers.*;


public class Main {

	public static void main (String... args) {
		
		EmployeeController empController = new EmployeeController();
		CustomerController custController = new CustomerController();
		
		//Add employee
		empController.addEmployee("Employee 1", "Address 1", 20.25);
		
		//Get single object of employee
		System.out.println("Employee name: "+empController.getEmployee().getName()
				+"\nEmployee addrress: "+empController.getEmployee().getAddress()
						+ "\nEmployee salary: "+empController.getEmployee().getSalary());	
		
		//Add space
		System.out.println();
		
		//Add customer
		custController.addCustomer("Customer 1", "Address 1");
		
		//Get single object of customer
		System.out.println("Customer name: "+custController.getCustomer().getName() 
				+"\nCustomer address: "+custController.getCustomer().getAddress());
	
	}	
}
