package access;

public class Employee {
	private String id;
	protected String name;
	int salary;		// 아무것도 안 쓰면 default

	public Employee() { // default constructor (이거 안 쓰면 argument constructor 있을 때 default 사용이 안 됨)
	} // 그래서 그냥 무조건 만들기

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

	private int getAnnSalary() {		// private으로 하면 이 클래스 안에서만 사용 가능, App class에서 사용 불가
		int result = 0;
		result = this.salary * 12;
		return result;
	}

	protected double getAnnTax() {
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
