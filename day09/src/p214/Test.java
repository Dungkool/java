package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input num...");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		} catch (ArithmeticException e1) { // ArithmeticException 발생 시 e1로 감
			System.out.println("0으로 나눌 수 없습니다."); // e1.printStackTrace(); 에러 표시해주는 함수 }
			return;
		} catch (NumberFormatException e2) { // NumberformatException 발생 시 e2로 감
			System.out.println("정수를 입력하세요.");
			return;
		}finally {	// 무조건 실행, sc.close 등 때문에
			System.out.println("반드시 실행...");
			sc.close();
		}

		/*
		 * catch (Exception e) { System.out.println("잘못 입력하셨습니다."); }
		 */
		/*
		 * catch (ArithmeticException | NumberFormatException e) { // exception 합치기
		 * System.out.println("잘못 입력하셨습니다."); e1.printStackTrace(); 에러 표시해주는 함수
		 */

		System.out.println("End Application...");
	}

}
