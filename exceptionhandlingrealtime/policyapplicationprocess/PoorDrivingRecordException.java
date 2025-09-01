package com.exceptionhandlingrealtime.policyapplicationprocess;

public class PoorDrivingRecordException extends Exception {

	private String message;

	public PoorDrivingRecordException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
