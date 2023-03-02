package aggregation;

public class Human {
	private String name;// human은 name을 가지고 있다.
	private Car car;	// human은 car를 가지고 있다. 여러대면 배열
	
	public Human() {
	}
		
	public Human(String name) {	// car가 없는 경우
		this.name = name;
	}

	public Human(String name, Car car) {	// car가 있는 경우
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}
	
	public void drive() {
		car.go();
	}
	
	public void stopCar() {
		car.stop();
	}
	
	
}
