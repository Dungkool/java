package oop2;

public class App {

	public static void main(String[] args) {

		Employee e1 = new Employee();  // default형, temp한 상황
		System.out.println(e1.toString());
		 
		Employee e2 = new Employee("이말숙", 5000000);
		System.out.println(e2.toString());
		System.out.println(e2.getAnnSalary());  // 연봉 계산식 호출
		System.out.println(e2.getTax()); 	// 세금 계산식 호출
	
		e2.setName("이말자");
		System.out.println(e2.toString());
	}

}
