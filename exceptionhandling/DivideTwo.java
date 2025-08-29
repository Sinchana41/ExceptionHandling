package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwo {
	//Problem 2: Multiple Catch Blocks
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		try {
			int numberOne=scanner.nextInt();
			int numbertwo=scanner.nextInt();
			scanner.close();
			System.out.println("Result : "+(numberOne/numbertwo));
		}catch (ArithmeticException e) {
			System.out.println("Zero is invalid divisor");
		}catch (InputMismatchException e) {
			System.out.println("Entered input is not integer");
		}
	}
}
