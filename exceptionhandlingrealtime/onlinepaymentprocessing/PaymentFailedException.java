package com.exceptionhandlingrealtime.onlinepaymentprocessing;

public class PaymentFailedException extends Exception  {

	private String message;

	public PaymentFailedException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
