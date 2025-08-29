package com.exceptionhandlingrealtime.onlinepaymentprocessing;

public class Payment {

	private int paymentId;
	private double amount;
	private String cardNumber;
	private String status;  // Pending, Success, Failed

	public Payment(int paymentId, double amount, String cardNumber) {
		if (amount <= 0) {
			throw new InvalidPaymentDetailsException("Amount must be greater than zero.");
		}
		if (cardNumber == null || cardNumber.length() != 16) {
			throw new InvalidPaymentDetailsException("Invalid card number. Must be 16 digits.");
		}

		this.paymentId = paymentId;
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.status = "Pending";
	}

	public int getPaymentId() { 
		return paymentId;
	}
	public double getAmount() { 
		return amount; 
	}
	public String getCardNumber() {
		return cardNumber; 
	}
	public String getStatus() {
		return status; 
	}
	public void setStatus(String status) { 
		this.status = status;
	}

	@Override
	public String toString() {
		return "Payment{id=" + paymentId + ", amount=" + amount +
				", status='" + status + "'}";
	}
}
