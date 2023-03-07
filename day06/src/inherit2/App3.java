package inherit2;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		
		Object obj1 = new Employee();	// 모든 class는 extends Object임 (but 생략)
		Object obj2 = new Manager();
		Object obj3 = new TaxCal();

	}

}
