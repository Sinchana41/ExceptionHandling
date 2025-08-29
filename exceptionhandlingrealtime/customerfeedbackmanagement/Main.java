package com.exceptionhandlingrealtime.customerfeedbackmanagement;

public class Main {

	public static void main(String[] args) {
		CustomerFeedbackSystem system = new CustomerFeedbackSystem();

		try {
			// Submitting feedback
			int id1 = system.submitFeedback("Great service and friendly staff!");
			int id2 = system.submitFeedback("Quick response time.");


			// Retrieve valid feedback
			System.out.println("Retrieved: " + system.getFeedback(id1));

			// This will throw checked exception
			System.out.println(system.getFeedback(100));

		} catch (FeedbackNotFoundException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace(); // logging
		} catch (InvalidFeedbackContentException e) {
			System.err.println("Validation Error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Unexpected Error: " + e.getMessage());
		}

		// Display all feedback
		system.displayAllFeedback();
	}
}
