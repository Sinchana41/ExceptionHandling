package com.exceptionhandlingrealtime.claimprocessingsystem;

public class FraudulentClaimException extends RuntimeException {

	private String message;

	public FraudulentClaimException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
