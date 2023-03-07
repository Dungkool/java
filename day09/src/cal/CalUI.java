package cal;

import java.util.Scanner;

public class CalUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 Number");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		double result = 0.0;
		try {
			result = Cal.div(a, b);
		} catch (Exception e) {
			System.out.println("분모가 0입니다.");
		}						// 에러가 난다면 Cal에서 발생하는것 -> 이걸 CalUI로 던져줘야 함
		System.out.println(result);
		sc.close();

	}

}
