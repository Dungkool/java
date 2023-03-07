package shape;

public abstract class Shape {	// 추상 class
	protected int x;
	protected int y;
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 함수의 모양이 없는 Abstract Method
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x + " , " + y;
	}
}
