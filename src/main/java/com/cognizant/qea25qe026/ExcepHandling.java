package com.cognizant.qea25qe026;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepHandling {
	public static void main(String[] args)  {
		try {
			exceptionMethod();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
	}
	
	public static void  exceptionMethod() throws FileNotFoundException {
		throw new FileNotFoundException("this is "); 
	}
}





//throws and throw 