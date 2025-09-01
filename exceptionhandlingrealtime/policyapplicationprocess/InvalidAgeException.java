package com.exceptionhandlingrealtime.policyapplicationprocess;

public class InvalidAgeException extends Exception {

	private String message;

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
