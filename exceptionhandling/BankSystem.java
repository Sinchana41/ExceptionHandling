package com.exceptionhandling;

import java.util.Scanner;

public class BankSystem {
	private int balance;

	public BankSystem(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public  void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Deposit successfull");
	}

	//Problem 7: Throwing Exceptions
	public void withDraw(int amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("WithDraw successfull");
		}else {
			try {
				throw new InsufficientFundsException("Insuffient balance");
			}catch (InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw:");
		BankSystem bankSystem=new BankSystem(1000);
		int amount=scanner.nextInt();
		bankSystem.withDraw(amount);
		scanner.close();
	}
}
