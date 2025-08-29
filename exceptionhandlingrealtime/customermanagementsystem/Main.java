package com.exceptionhandlingrealtime.customermanagementsystem;

public class Main {

	public static void main(String[] args) {
		CustomerManagementSystem cms = new CustomerManagementSystem();

		try {
			// Adding customers
			cms.addCustomer(new Customer(1, "Sinchana", "sinchana@mail.com"));
			cms.addCustomer(new Customer(2, "krishna", "krishna@mail.com"));

			// Update customer
			cms.updateCustomer(1, "sushma", "sushma@mail.com");

			// Delete customer
			cms.deleteCustomer(2);

		} catch (CustomerNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (InvalidCustomerDataException e) {
			System.out.println("Validation Error: " + e.getMessage());
		}
	}
}
