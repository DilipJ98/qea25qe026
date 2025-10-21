package com.cognizant.qea25qe026;

public class MethodOverLoading {
	public static void main(String[] args) {
		main(0);
		main("Java");
	}
	
	public static void main(int args) {
		System.out.println(args);
	}
	public static void main(String args) {
		System.out.println(args);
	}
}
