package inherit;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public double getAnnSalary(){	// 결과를 만들어서 double로 return
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}

	@Override
	public String toString() {		// 출력할 수 있게 보여주는 것
		return id + " " + name + " " + salary;
	}
	
}
