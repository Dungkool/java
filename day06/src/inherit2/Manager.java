package inherit2;

public class Manager extends Employee{	// 상속 : extends + class명, 필드와 메소드 상속
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {	// 2번쨰 constructor가 bonus가 없으니 getter, setter를 넣어서 불러올 수 있게함
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	// 함수의 재정의(odverriding) -> 안 하면 상위 employee랑 똑같이 나옴
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = // (this.getSalary() + this.bonus) * 12;
				 	super.getAnnSalary() + (this.bonus * 12);
		return result;
	}

	@Override	// Manager class의 toString + inherit의 toString
	public String toString() {
		return super.toString() + " " + bonus;
	}
	
	
}
