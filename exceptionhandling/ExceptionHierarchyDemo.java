package com.exceptionhandling;

public class ExceptionHierarchyDemo {

	//Problem 5: Exception Hierarchy
	public static void main(String[] args) {
		try {
			int result = 10 / 0;   // This will throw ArithmeticException

			String str = null;
			System.out.println(str.length());  // This will throw NullPointerException

		} 
		catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: Division by zero is not allowed!");
		} 
		catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: Trying to access an object that is null!");
		} 
		catch (Exception e) {
			System.out.println("Caught Generic Exception: " + e.getMessage());
		}

		System.out.println("Program continues after handling exceptions...");
	}
}
