package com.exceptionhandlingrealtime.onlinepaymentprocessing;

import java.util.*;

public class PaymentProcessingSystem {

	private Map<Integer, Payment> payments = new HashMap<>();
	private Random random = new Random();

	// Process payment
	public void processPayment(Payment payment) throws PaymentFailedException {
		log("Processing payment: " + payment);

		// Simulate random transaction failure
		boolean success = random.nextBoolean(); 

		if (!success) {
			payment.setStatus("Failed");
			log("Payment failed for ID: " + payment.getPaymentId());
			throw new PaymentFailedException("Transaction failed due to network/processing issue.");
		}

		// If success
		payment.setStatus("Success");
		payments.put(payment.getPaymentId(), payment);
		log("Payment successful: " + payment);
	}

	// Fetch payment by ID
	public Payment getPayment(int id) {
		return payments.get(id);
	}

	// Display all payments
	public void displayAllPayments() {
		if (payments.isEmpty()) {
			System.out.println("No payments found.");
		} else {
			payments.values().forEach(System.out::println);
		}
	}

	// Logger for auditing
	private void log(String message) {
		System.out.println("[LOG] " + message);
	}
}
