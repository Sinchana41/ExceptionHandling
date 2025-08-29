package com.exceptionhandlingrealtime.claimprocessingsystem;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ClaimProcessingSystem system = new ClaimProcessingSystem();

		String policyHolder = "Sinchana";
		double coverageAmount = 100000;
		LocalDate start = LocalDate.of(2024, 1, 1);
		LocalDate end = LocalDate.of(2025, 12, 31);

		try {
			//Valid claim
			system.processClaim(policyHolder, 50000, LocalDate.of(2025, 6, 15),
					coverageAmount, start, end);

			//Invalid claim amount (greater than coverage)
			system.processClaim(policyHolder, 150000, LocalDate.of(2025, 5, 10),
					coverageAmount, start, end);

			//Fraudulent claim (date outside policy period)
			system.processClaim(policyHolder, 20000, LocalDate.of(2026, 1, 10),
					coverageAmount, start, end);

		} catch (InvalidClaimAmountException e) {
			System.err.println("Invalid Claim: " + e.getMessage());
			system.notifyClaimsDepartment("Invalid claim amount detected", policyHolder);
		} catch (FraudulentClaimException e) {
			System.err.println("Fraud Alert: " + e.getMessage());
			system.notifyClaimsDepartment("Fraudulent claim detected", policyHolder);
		} catch (Exception e) {
			System.err.println("Unexpected Error: " + e.getMessage());
		}
	}
}
