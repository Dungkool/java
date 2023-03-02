package aggregation;

public class App {

	public static void main(String[] args) {
		Human human = new Human("James");		// human 생성
		System.out.println(human);
		
		Car car = new Car("k1", "red", 1000);	// car 생성
		human.setCar(car);						// human과 자동차 포함 관계 set, Car.java에 toString 확인
		System.out.println(human);
		
		human.drive();
		human.stopCar();
	}

}
