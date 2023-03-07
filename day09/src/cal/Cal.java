package cal;

public class Cal {
	public static double div(int a, int b) throws Exception { // 발생한 에러를 CalUI(App 화면)으로 던짐
		double result = 0.0;
		try {
			result = a / b;
		}catch (Exception e) {
			throw e; 			// 발생한 에러를 CalUI(App 화면)으로 던짐
			
		}
		return result;
	}

	public static double div(double a, double b) throws InfinityException {	// 예외를 만들어서 던짐
		double result = 0.0;
		if(b == 0.0) {	// 예외를 만들어서 던짐, throw와 throws는 같이 써야함
			throw new InfinityException("B0001");
		}
		result = a / b;
		return result;
	}
}
