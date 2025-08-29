package com.exceptionhandlingrealtime.claimprocessingsystem;

import java.time.LocalDate;

public class ClaimProcessingSystem {

	public void processClaim(String policyHolder, double claimAmount, LocalDate claimDate,
			double coverageAmount, LocalDate policyStartDate, LocalDate policyEndDate) {

		// Validate claim amount
		if (claimAmount <= 0) {
			throw new InvalidClaimAmountException("Claim amount must be greater than zero!");
		}
		if (claimAmount > coverageAmount) {
			throw new InvalidClaimAmountException("Claim amount exceeds policy coverage!");
		}

		// Validate claim date within policy period
		if (claimDate.isBefore(policyStartDate) || claimDate.isAfter(policyEndDate)) {
			throw new FraudulentClaimException("Claim date is outside the policy coverage period!");
		}

		// If all validations pass
		System.out.println("Claim processed successfully for policy holder: " + policyHolder);
	}

	// Simulated notification system
	public void notifyClaimsDepartment(String issue, String policyHolder) {
		System.out.println("Notification to Claims Dept: " + issue + " [PolicyHolder: " + policyHolder + "]");
	}
}
