package com.cognizant.qea25qe026;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		try {
			withDrawl();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void withDrawl() throws Exception {
		Scanner sc = new Scanner(System.in);
		int balance = 1000;
		System.out.println("Please enter amount to withdrawl");
		int withDrawlAmount = sc.nextInt();
		
		if (balance < withDrawlAmount) {
			throw new NotEnoughFundsException();
		}
	}

}




class NotEnoughFundsException  extends Exception {
	public NotEnoughFundsException() {
		super("Low balance");
	}
}
