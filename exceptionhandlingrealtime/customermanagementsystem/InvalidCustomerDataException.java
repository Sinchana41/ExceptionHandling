package com.exceptionhandlingrealtime.customermanagementsystem;

public class InvalidCustomerDataException extends RuntimeException {

	private String message;

	public InvalidCustomerDataException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
