package com.exceptionhandling;

import java.util.Scanner;

public class DivideThree {

	//Problem 6: Finally Block
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		scanner.close();
		try {
			System.out.println("Result : "+(100/number));
		}catch (ArithmeticException e) {
			System.out.println("Zero is invalid");
		}finally {
			System.out.println("Division operation is complete");
		}
	}
}
