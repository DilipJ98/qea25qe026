package collections;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
	
	public int compare(Employee one, Employee two) {
		return  Integer.compare(one.id, two.id);
	}
}
