package org.example.junit_example.models;

public class Customer {
	
	private String name;
	private String address;
	
	//Default constructor
	public Customer() {}
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
