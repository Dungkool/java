package oop1;

public class Car {
	// attribute(속성)
	public String name;
	public String color;
	public int size;
	
	// constructor(생성자) : 연결해주는 역할
	public Car() {
		this.name = "k1";  // this를 생략해서 작성 가능 , name = "k1";
		this.color = "red";
		this.size = 1000;
	} // return 타입이 없음
	
	public Car(String name, String color, int size) {   // constructor는 이름(car)은 같아도 되나 형식에 따라 다르게 호출
		this.name = name;    // heap 메모리의 name영역에 16행에서 입력한 name을 넣어라.
		this.color = color;
		this.size = size;
	}
	
	// operation(행위)
	public void go() {
		System.out.printf("%s, %s Go car...\n", this.name, this.color); // this 생략 가능, 해당 레퍼런스로 실행하라는 뜻, this는 주소
	}
	public void stop() {
		System.out.printf("%s, %s Stop car...\n", this.name, this.color);
	}
}
