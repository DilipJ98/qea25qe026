package collections;

public class Employee  {
	int id;
	String name;
	String role;
	
	
	public Employee(int id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
