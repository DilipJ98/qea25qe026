package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx {
	public static void main(String[] args) {

		Employee empThree = new Employee(50, "Billings", "Tester");
		Employee emp = new Employee(10, "Sam", "Software engineer" );
		Employee empTwo = new Employee(20, "Hain", "Developer");
		
		List<Employee> list = Arrays.asList(emp, empTwo, empThree);
		
		Collections.sort(list, new SortById());
		
		System.out.println(list);
		
	}
}



//int -> Integer
//flot -> Float
//boolean -> Boolean
//double -> Double
//char -> Character