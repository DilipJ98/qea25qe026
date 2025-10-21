package com.cognizant.qea25qe026;

public interface InterfaceEx {
	
	int b = 10;
		
	 void sample();
	 void sampleTwo();
	 void sampleThree();
	
	 default void defaultMethod() {
		 System.out.println("default method");
	 }
}
