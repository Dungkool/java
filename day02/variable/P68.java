package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "11";
		String s1 = "10";
		int s2 = Integer.parseInt(s1); // 문자를 숫자로 변환, double은 double.parsedouble
		int a = 10;
		System.out.println(s2 + a); // String과 숫자를 더하면 숫자가 문자로 바뀜

		Random r = new Random(); // jdk 쓸 떄 밑에다가 패키지 import해야 함, Ctrl + Shift + O
		int rndNum = r.nextInt(45)+1;
		System.out.println(rndNum);
	}

}
