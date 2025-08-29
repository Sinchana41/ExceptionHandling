package com.exceptionhandlingrealtime.customermanagementsystem;

import java.util.*;

public class CustomerManagementSystem {

	private Map<Integer, Customer> customers = new HashMap<>();

	// Add Customer
	public void addCustomer(Customer customer) {
		if (customers.containsKey(customer.getId())) {
			throw new InvalidCustomerDataException("Customer with ID " + customer.getId() + " already exists.");
		}
		customers.put(customer.getId(), customer);
		System.out.println("Customer added");
	}

	// Update Customer
	public void updateCustomer(int id, String newName, String newEmail) throws CustomerNotFoundException {
		Customer customer = customers.get(id);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer with ID " + id + " not found.");
		}
		customer.setName(newName);
		customer.setEmail(newEmail);
		System.out.println("Customer updated");
	}

	// Delete Customer
	public void deleteCustomer(int id) throws CustomerNotFoundException {
		if (!customers.containsKey(id)) {
			throw new CustomerNotFoundException("Customer with ID " + id + " not found.");
		}
		customers.remove(id);
		System.out.println("Customer Deleted");
	}
}
