package org.example.junit_example.interfaces;

import org.example.junit_example.models.Employee;

public interface EmployeeInterface {

	//Get employee
	public Employee getEmployee();
	
	//Add employee
	public String addEmployee(String name, String address, double salary);
	
}
