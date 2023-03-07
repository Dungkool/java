package bank;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Account acc = null;

		// 계좌생성
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("원하는 작업을 입력하세요.");
			System.out.println("조회, 계좌생성, 입금, 출금, 종료");
			String cmd = sc.next();
			if (cmd.equals("종료")) {
				break;
			} else if (cmd.equals("계좌생성")) {
				System.out.println("계좌명을 입력하세요.");
				String name = sc.next();
				System.out.println("예금주를 입력하세요.");
				String accHolder = sc.next();
				System.out.println("가입금액을 입력하세요.");
				double balance = sc.nextDouble();
				try {
					acc = new Account(name, accHolder, balance);
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			} else if (cmd.equals("조회")) {
				System.out.println(acc);
			} // 계좌 입금
			else if (cmd.equals("입금")) {
				System.out.println("입금할 금액을 입력하세요.");
				double money = sc.nextDouble();
				try {
					acc.deposit(money);
					System.out.println("현재 잔액은 " + acc.getbalance() + "원 입니다.");
				} catch (DepositException e) {
					System.out.println(e.getMessage());
				}
			} // 계좌 출금
			else if (cmd.equals("출금")) {
				System.out.println("출금할 금액을 입력하세요.");
				double money = sc.nextDouble();
				try {
					acc.withdraw(money);
					System.out.println("현재 잔액은 " + acc.getbalance() + "원 입니다.");
				} catch (WithdrawException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		sc.close();
	}
}
