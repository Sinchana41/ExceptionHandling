package com.exceptionhandlingrealtime.policyapplicationprocess;

public class Main {

	public static void main(String[] args) {
		// Example 1: Invalid age
		PolicyApplication app1 = new PolicyApplication(16, true, true);

		// Example 2: Poor driving record
		PolicyApplication app2 = new PolicyApplication(30, false, true);

		// Example 3: Health issues
		PolicyApplication app3 = new PolicyApplication(40, true, false);

		// Example 4: Valid case
		PolicyApplication app4 = new PolicyApplication(35, true, true);

		process(app1);
		process(app2);
		process(app3);
		process(app4);
	}

	// Helper method to process and handle exceptions
	private static void process(PolicyApplication app) {
		try {
			app.processApplication();
		} catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
