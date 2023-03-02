package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;
import com.kbstar.hrd.Manager;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "이말숙", 500);	// argument가 다르게 여러개 출력할 수 있는 것은 overload
		System.out.println(e);	// e.toStirng에서 toString 생략 가능
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		System.out.println(e.getAnnSalary());
		System.out.println(e.getAnnTax());
		
		System.out.println("==================================");
		
		Employee emps[] = new Employee[3];	// Employee type의 배열 선언 및 사이즈 초기화
		emps[0] = new Employee("201", "홍말자", 400);
		emps[1] = new Employee("202", "정말자", 450);
		emps[2] = new Employee("203", "장말자", 480);
		
		for(Employee data : emps) {		// emps가 Employee type이므로 Employee data로 작성
			System.out.println(data);
			System.out.println(data.getTax());
			System.out.println(data.getAnnSalary());
			System.out.println(data.getAnnTax());
		}
		System.out.println("==================================");
		
		Manager m = new Manager("001", "김국민", 1000, 100);
		System.out.println(m);
		System.out.println(m.getSalary());
		System.out.println(m.getBonus());
		System.out.println(m.getTax());
		System.out.println(m.getAnnSalary());
		System.out.println(m.getAnnTax());
		
	}

}
