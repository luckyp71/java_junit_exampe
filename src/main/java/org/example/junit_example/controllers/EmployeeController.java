package org.example.junit_example.controllers;

import org.example.junit_example.models.Employee;
import org.example.junit_example.interfaces.EmployeeInterface;

public class EmployeeController implements EmployeeInterface {

	private Employee employee = null; 
	
	@Override
	public Employee getEmployee() {
		return this.employee;
	}

	@Override
	public String addEmployee(String name, String address, double salary) {
		this.employee = new Employee(name, address, salary);
		return "Success";
	}

}
