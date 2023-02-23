package seflStudy;

import java.util.Scanner;

public class Feb23rd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력하세요.");
		String address = sc.next();
		int at = address.indexOf("@");
		String domain = address.substring(at+1);

		String result = (domain.equals("naver.com")) ? "N" : (domain.equals("google.com")) ? "G" : "etc";
		System.out.print(result);
		
		sc.close();
		
	}
}
