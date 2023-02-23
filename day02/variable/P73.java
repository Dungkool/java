package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		String str = "";
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력하시오.(q,i,d,s)");
		String cmd = sc.next();
		System.out.printf("%s를 입력 했습니다.", cmd);
		sc.close(); 									// 연결된 상태를 종료해야 함
	}

}
