package com.exceptionhandlingrealtime.customerfeedbackmanagement;

public class FeedbackNotFoundException extends Exception {

	private String message;

	public FeedbackNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
