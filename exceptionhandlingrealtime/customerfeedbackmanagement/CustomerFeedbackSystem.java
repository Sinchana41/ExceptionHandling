package com.exceptionhandlingrealtime.customerfeedbackmanagement;

import java.util.*;

public class CustomerFeedbackSystem {

	private Map<Integer, String> feedbackDatabase = new HashMap<>();
	private int feedbackCounter = 1;

	//submit feedback
	public int submitFeedback(String feedback) {
		validateFeedback(feedback);
		int id = feedbackCounter++;
		feedbackDatabase.put(id, feedback);
		System.out.println("Feedback submitted successfully with ID: " + id);
		return id;
	}

	//validate feedback content
	private void validateFeedback(String feedback) {
		if (feedback == null || feedback.trim().isEmpty()) {
			throw new InvalidFeedbackContentException("Feedback content cannot be empty!");
		}
		if (feedback.toLowerCase().contains("badword")) {
			throw new InvalidFeedbackContentException("Inappropriate feedback content detected!");
		}
	}

	//get feedback by ID
	public String getFeedback(int id) throws FeedbackNotFoundException {
		if (!feedbackDatabase.containsKey(id)) {
			throw new FeedbackNotFoundException("Feedback with ID " + id + " not found.");
		}
		return feedbackDatabase.get(id);
	}

	//display all feedback
	public void displayAllFeedback() {
		if (feedbackDatabase.isEmpty()) {
			System.out.println("No feedback available.");
		} else {
			System.out.println("All Customer Feedback:");
			feedbackDatabase.forEach((id, feedback) ->
			System.out.println("ID: " + id + " -> " + feedback));
		}
	}
}
