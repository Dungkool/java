package inherit;

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
			// getIncentive는 보이지 않음 Employee로 선언된 함수기 때문에 Employee에 정의된 함수만 보임
			if(data instanceof Sales) {		// 배열에서 꺼낸 객체 type 비교
				Sales s = (Sales)data;		// Employee를 Sales type으로 변환
				System.out.println(s.getIncentive());
			}
		}								
		
	}

}
