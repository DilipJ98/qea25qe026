package com.cognizant.qea25qe026;


public class AdvanceCal extends BasicCalculator {
		
	int number;
	
	public AdvanceCal(int number){
		this.number = number;
	}
	
	public int multi(int a, int b) {
		int num = 10;
		System.out.println(number);
		return a * b;
	}
	
	public double division(int a, int b) {
		return a / b;
	}
	
	@Override
	public int add(int a, int b) {
		System.out.println("child class add");
		return a + b;
	}
	
	public static void main(String[] args) {
		BasicCalculator cal = new AdvanceCal(1000);
		cal.add(10, 20);
	}
}
