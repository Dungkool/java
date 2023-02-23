package variable;


public class P75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		System.out.printf("%d, %d \n", a, b);
		
		int result = ++a + b++;
		System.out.printf("%d, %d \n", a, b);
		System.out.println(result);
		
		int aa = 10;
		int bb = 10;
		
		System.out.println( (aa++ >= 0) | (bb++ >= 0) );   // ||는 결과 확정 시 나머지 연산 종료, bb++가 연산되지 않음
		System.out.printf("%d, %d \n", aa, bb);
	}

}
