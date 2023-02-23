package variable;

public class P54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// boolean
		boolean b1 = 10 > 5;
		
		// 정수(default : int)
		int n1 = 10;
		long n2 = 0L;  // 정수의 기본형이 int라서 long으로 변환하기 위해 L을 붙인다.
		n2 = 2222222222222222L;
		
		// 실수(default : double)
		double d1 = 1.0;
		float f1 = 1.0F; // 실수의 기본형이 double이라서 F를 붙인다.
		
		double d2 = 1/2; //정수와 정수의 연산은 정수로 결과값이 나옴
		System.out.println(d2);
		
		double d3 = 10.0/3.0;
		System.out.println(d3);
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);
		
		// 문자
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2);
		
		int n3 = 10;
		double n4 = 10.0;
		double result = n3 + n4;
	}

}
