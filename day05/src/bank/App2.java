package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null; // 레퍼런스 타입 초기화는 null, 위에다 acc를 선언해야 계좌가 유지됨
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input Commnad(c,w,d,s,q)...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			}
			if (cmd.equals("c")) {
				System.out.println("Create Account : ");
				System.out.println("Input Account Info[name, balance]");
				System.out.println("Input Name : ");
				String name = sc.next();
				System.out.println("Input Balance : ");
				double balance = Double.parseDouble(sc.next());
				acc = new Account(name, balance);
				System.out.println(acc);

			}
			if (cmd.equals("w")) {
				System.out.println("Withdraw : ");
				System.out.println("Input Withdraw Money...");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);		// 함수 불러오기
				System.out.println(acc);
			}
			if (cmd.equals("d")) {
				System.out.println("Deposit : ");
				System.out.println("Input Deposit Money...");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println(acc);
			}
			if (cmd.equals("s")) {
				System.out.println("Select : ");
				System.out.println(acc);
			}
		}
		sc.close();
	}

}
