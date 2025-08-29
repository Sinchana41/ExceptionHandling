package com.exceptionhandlingrealtime.onlinepaymentprocessing;

public class InvalidPaymentDetailsException extends RuntimeException{

	private String message;

	public InvalidPaymentDetailsException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
