package overloading;

public class Calculator {
	public int sum(int a, int b) {	// overload 개념으로 sum은 같으나 argument가 다름
		int result = 0;				// return이 다른 건 보지않고 argument의 형식이 같은지, 다른지만 봄
		result = a + b;
		return result;
	}
	
	public int sum(int a, int b, int c) {
		int result = 0;
		result = a + b + c;
		return result;
	}
	
	public int sum(int a, int b, int c, int d) {	
		int result = 0;
		result = a + b + c + d;
		return result;
	}
	

}
