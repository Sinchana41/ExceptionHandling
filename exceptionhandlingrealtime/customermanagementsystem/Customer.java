package com.exceptionhandlingrealtime.customermanagementsystem;

public class Customer {
	private int id;
	private String name;
	private String email;

	public Customer(int id, String name, String email) {
		if (name == null || name.isEmpty() || email == null || !email.contains("@")) {
			throw new InvalidCustomerDataException("Invalid customer data: Name or Email is not valid.");
		}
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() { 
		return id; 
	}
	public String getName() { 
		return name; 
	}
	public String getEmail() { 
		return email; 
	}

	public void setName(String name) {
		if (name == null || name.isEmpty())
			throw new InvalidCustomerDataException("Invalid name provided.");
		this.name = name;
	}

	public void setEmail(String email) {
		if (email == null || !email.contains("@"))
			throw new InvalidCustomerDataException("Invalid email provided.");
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
	}
}
