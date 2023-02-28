package oop3;

public class Car {
	// attribute(속성)
	private String name;
	private String color;
	private int size;
	private int fsize;
	private int cfsize;

	// constructor(생성자) : 연결해주는 역할
	public Car() {
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;
	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	/*
	 * 기름을 넣는다. return 필요 x -> void 기름통 보다 많이 넣으면 - 다시 주유하세요. 음수값이 들어가면 - 다시 주유하세요.
	 */
	public void setCfsize(int size) {
		if (size <= 0 || size > (fsize - cfsize)) {
			System.out.println("다시 주유하세요.");
			return;
		}
		cfsize += size;
		System.out.println("주유 완료");
	}

	// 주행을 한다.
	// 1리터 당 10km를 주행할 수 있다.
	public void go(int distance) {
		if (cfsize <= 0 || cfsize < (distance / 10)) {
			System.out.println("주유하세요.");
			return; // else 쓰지말고 return으로 끝내기
		}
		System.out.printf("%s %d Go...", this.name, distance);
		cfsize -= (distance / 10);
	}

	// 멈춘다.
	public void stop() {
		System.out.printf("%s Stop...", this.name);
	}

}
