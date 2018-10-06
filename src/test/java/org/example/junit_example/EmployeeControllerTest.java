package org.example.junit_example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.example.junit_example.controllers.EmployeeController;
import org.example.junit_example.models.Employee;

public class EmployeeControllerTest {

	EmployeeController empController = new EmployeeController();
	
	
	//Test add employee
	@Test
	public void testAddEmployee() {
		String expectedResult = "Success";
		String actualResult = empController.addEmployee("Emplooye 1", "Address 1", 20.25);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testGetCustomer() {
		empController.addEmployee("Employee 1", "Address 1", 20.25);
		Employee expectedResult = new Employee("Employee 1", "Address 1", 20.25);
		Employee actualResult = empController.getEmployee();
		
		assertEquals(expectedResult.getName(), actualResult.getName());
	}
	
}
