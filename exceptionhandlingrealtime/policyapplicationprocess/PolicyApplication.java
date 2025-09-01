package com.exceptionhandlingrealtime.policyapplicationprocess;

public class PolicyApplication {

	private int age;
	private boolean hasGoodDrivingRecord;
	private boolean hasGoodHealth;

	public PolicyApplication(int age, boolean hasGoodDrivingRecord, boolean hasGoodHealth) {
		this.age = age;
		this.hasGoodDrivingRecord = hasGoodDrivingRecord;
		this.hasGoodHealth = hasGoodHealth;
	}

	// Validation methods
	public void validateAge() throws InvalidAgeException {
		if (age < 18 || age > 70) {
			throw new InvalidAgeException("Invalid age: " + age + " Age must be between 18 and 70.");
		}
	}

	public void validateDrivingRecord() throws PoorDrivingRecordException {
		if (!hasGoodDrivingRecord) {
			throw new PoorDrivingRecordException("Poor driving record detected. Application denied.");
		}
	}

	public void validateHealth() throws HealthIssueException {
		if (!hasGoodHealth) {
			throw new HealthIssueException("Health issues detected. Application denied.");
		}
	}

	public void processApplication() throws InvalidAgeException, PoorDrivingRecordException, HealthIssueException {
		validateAge();
		validateDrivingRecord();
		validateHealth();
		System.out.println("Policy Application Approved");
	}
}
