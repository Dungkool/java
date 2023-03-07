package shape;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	

	public Rectangle() {
	}

	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}



	@Override	// shape 때문에 무조건 2개의 함수가 구현되어야 함
	public double getArea() {
		return width * height;
	}

	@Override	// shape 때문에 무조건 2개의 함수가 구현되어야 함
	public double getCircumn() {
		return (width + height) * 2;
	}


}
