package com.exceptionhandlingrealtime.claimprocessingsystem;

public class InvalidClaimAmountException extends RuntimeException {

	private String message;

	public InvalidClaimAmountException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
