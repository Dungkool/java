package inherit;

public class Sales extends Employee {
	private String loc;
	private double rate;
	public Sales() {
	}
	
	public Sales(String id, String name, double salary) {	// constructor from super class (상위 클래스 것만 가져옴)
		super(id, name, salary);
		
	}

	public Sales(String id, String name, double salary, String location, double rate) {
		super(id, name, salary);
		this.loc = location;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString() + " " + loc + " " + rate;
	}

	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (getIncentive() * 12);
		return result;
	}
	
	public double getIncentive() {		// salese에만 있는 specialization된 함수
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}
	
}
