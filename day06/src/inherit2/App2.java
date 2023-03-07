package inherit2;

public class App2 {

	public static void main(String[] args) {
		// Manager is a Employee, 매니저는 직원에 속한다.
		Employee e = new Manager("100", "james", 500, 50);
		// Manager m = new Employee("100", "james", 550); -> 불가능
		
		Employee ea[] = new Employee[5];
		
		ea[0] = new Employee("100", "james", 500);
		ea[1] = new Employee("101", "james", 500);
		ea[2] = new Manager("102", "james", 500, 50);
		ea[3] = new Manager("103", "james", 500, 50);
		ea[4] = new Sales("104", "james", 500, "Seoul", 0.35);
		
		for(Employee data : ea) {
			System.out.println(data);					// 의미는 연봉을 가져와라지 하나지만 표현되는 식의 모양이 다름
			System.out.println(data.getAnnSalary());	// 이게 다형성(Polymorphism)
			System.out.println(data.getIncentive());
		}
		
		System.out.println("------------------------------------------------");
		
		TaxCal t = new TaxCal();
		double result = t.getTax(ea[4]);	// promotion 자동타입변환, argument가 employee지만 manager, sales 배열도 입력 가능
		System.out.println(result);
		
	}

}
