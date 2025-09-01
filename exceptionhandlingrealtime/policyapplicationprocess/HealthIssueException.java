package com.exceptionhandlingrealtime.policyapplicationprocess;

public class HealthIssueException extends Exception{

	private String message;

	public HealthIssueException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
