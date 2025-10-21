package com.cognizant.qea25qe026;

public class ImplementInterface implements InterfaceEx  {
	public void  sample() {
		System.out.println("Sample");
	}
	
	public void sampleTwo() {
		System.out.println("sample two");
	}
	
	public void sampleThree() {
		System.out.println("sample three");
	}
	
	
	public static void main(String[] args) {
		InterfaceEx im = new ImplementInterface();
		im.sample();
		im.sampleTwo();
		im.sampleThree();
	}
	
}
