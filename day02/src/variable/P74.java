package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("숫자를 입력하십시오.(10~100)");
		String cmd = sc.next();
		// 10~100 사이의 정수를 입력받는다.
		// 1부터 입력받은 숫자까지의 범위에서 랜덤한 숫자를 발생하시오.	
		
		int cmd2 = Integer.parseInt(cmd);
		int rndNum = r.nextInt(cmd2) + 1;
		System.out.println(rndNum);
		sc.close(); 									// 연결된 상태 종료
	}

}
