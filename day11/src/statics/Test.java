package statics;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car("k1", "KIA");	// constructor 사용
		System.out.println(c1);
		
		Car c2 = new Car("G10", Car.makerName);	// static인 makername은 car라는 class의 것, 객체는 관여 X
		System.out.println(c2);
	}

}
