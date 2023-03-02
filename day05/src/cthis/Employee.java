package cthis;

import java.util.Calendar;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee() { 		// default constructor (이거 안 쓰면 argument constructor 있을 때 default 사용이 안 됨)
		Calendar cal = Calendar.getInstance();		// 그래서 그냥 무조건 만들기
		this.id = "" + cal.get(Calendar.YEAR) + cal.get(Calendar.MILLISECOND);		// Calendar.YEAR은 int이므로 String으로 변경 	
	}
	
	public Employee(String name, int salary) {	// name과 salary만 받고 id는 자동생성 할 것
		this();		// public Emloyee(){}를 호출 -> 여기서 id값이 자동 생성
		this.name = name;
		this.salary = salary;
	}

	public Employee(String id, String name, int salary) { // argument가 있는 constructor
		this.id = id; // constructor는 field에서 값을 초기화
		this.name = name;
		this.salary = salary;
	}

	// getter and setter, private된 값 사용하기 위해서

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

	public double getTax() { // 함수 만들기
		double result = 0.0; // 같은 값으로 초기화 (0으로 초기화 x)
		result = this.salary * 0.17;
		return result;
	}

	public int getAnnSalary() {
		int result = 0;
		result = this.salary * 12;
		return result;
	}

	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() * 0.17; // 위에 있는 함수 호출하기
		return result;
	}

	// 단순히 출력만을 위한 함수 (source -> toString)
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
