package p214;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("Input num...");
		int num = 0;
		try(Scanner sc = new Scanner(System.in)) {	// 자동적으로 close가 됨
		num = Integer.parseInt(sc.next());
		int result = 10 / num;
		System.out.println(result);
		}catch(Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}

		System.out.println("End Application...");
	}

}
