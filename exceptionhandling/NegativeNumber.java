package com.exceptionhandling;

import java.util.Scanner;

public class NegativeNumber {

	//Problem 4: Custom Unchecked Exception
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		scanner.close();
		if(number>=0) {
			System.out.println("Positive Number");
		}else {
			try {
				throw new NegativeNumberException("Negative Number");
			}catch (NegativeNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
