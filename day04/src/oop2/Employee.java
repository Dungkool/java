package oop2;

import java.util.Calendar;
import java.util.Random;

public class Employee {
	private String id;  	// private : 접근제어 처음에만 접근 가능, public은 그냥 접근 가능
	private String name;
	private int salary;

	// constructor는 자동 generate 가능
	// argument는 다르게 여러개 선언

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
		}else {
			this.salary = salary;
		}
	}
	
	public Employee(String name, int salary) { // 이름과 급여를 입력하면 자동으로 id가 만들어지게 하는 constructor
		this("10000", name, salary);		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175; // 정수 * 실수 = 실수
	}

	@Override	// source -> Generate toString
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
