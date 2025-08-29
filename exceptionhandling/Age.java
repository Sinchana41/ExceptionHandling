package com.exceptionhandling;

import java.util.Scanner;

public class Age {

	//Custom Checked Exception
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Age of a person: ");
		int age=scanner.nextInt();
		scanner.close();
		if(age>18) {
			System.out.println("Valid Age");
		}else {
			try {
				throw new InvalidAgeException("Invalid age");
			}catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
