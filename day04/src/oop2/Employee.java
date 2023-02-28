package oop2;

public class Employee {
	public String id;
	public String name;
	public int salary;
	
	// constructor는 자동 generate 가능
	// argument는 다르게 여러개 선언
	
	public Employee() {
	}
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	

	
}
