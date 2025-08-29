package com.exceptionhandlingrealtime.onlinepaymentprocessing;

public class Main {

	public static void main(String[] args) {
		PaymentProcessingSystem paymentsystem = new PaymentProcessingSystem();

		try {
			// Valid payment
			Payment payment1 = new Payment(101, 5000.0, "1234567890123456");
			paymentsystem.processPayment(payment1);

			// Invalid details (throws unchecked exception)
			Payment payment2 = new Payment(102, -2000.0, "9999"); // invalid amount and card
			paymentsystem.processPayment(payment2);

		} catch (PaymentFailedException e) {
			System.err.println("Payment Error: " + e.getMessage());
		} catch (InvalidPaymentDetailsException e) {
			System.err.println("Validation Error: " + e.getMessage());
		}

		// Show all payments
		paymentsystem.displayAllPayments();
	}
}
