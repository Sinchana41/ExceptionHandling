package com.exceptionhandlingrealtime.customermanagementsystem;

public class CustomerNotFoundException extends Exception {

	private String message;

	public CustomerNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
