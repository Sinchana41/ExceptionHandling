package com.exceptionhandlingrealtime.customerfeedbackmanagement;

public class InvalidFeedbackContentException extends RuntimeException{

	private String message;

	public InvalidFeedbackContentException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
