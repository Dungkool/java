package variable;

public class P64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d %4.2f %s \n", a, d, str1);  // 정수 d, 실수 f, 문자 s
		// 4.2는 앞에 소수점 앞에 4자리, 뒤에 2자리 표시
		
		if(str1 == str2) {    			// str1과 str2의 주소값을 비교
			System.out.println("OK");
		}
		if(str1.equals(str2)) {			// str1과 str2의 값(abc)을 비교
			System.out.println("OK2");
		}
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		if(str1 == str3) {    			// str1과 str3의 주소값이 달라서 OK가 안뜸
			System.out.println("OK");
		}
		
	}	
}
