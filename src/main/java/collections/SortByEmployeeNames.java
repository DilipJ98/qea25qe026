package collections;

import java.util.Comparator;

public class SortByEmployeeNames implements Comparator<Employee> {
	
	public int compare(Employee objOne, Employee objTwo) {
		return objOne.name.compareTo(objTwo.name);
	}
}
