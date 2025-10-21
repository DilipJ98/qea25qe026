package com.cognizant.qea25qe026;

public class Encap {
	public static void main(String[] args) {
		Main cap = new Main();
		cap.setIdAndName(200, "Java");
		System.out.println(cap.getId());
		System.out.println(cap.getName());
	}
}

class Main{
	private int id;
	private String name;

	public void setIdAndName(int id, String name) {
		if (id > 100) {
			this.id = id;
			this.name = name;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
}