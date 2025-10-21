package com.cognizant.qea25qe026;

public  class BasicCalculator {
	
	int phoneNum;
	
	
	public BasicCalculator() {
		System.out.println("this is my parent class");
	}
	
	public int add(int numberOne, int numberTwo) {
		System.out.println("parent cLASS ADD");
		return numberOne + numberTwo;
	}
	
	public int sub(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
}
