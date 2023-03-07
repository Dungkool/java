package com.kbstar.dto;

public class AccountDTO {
	private String accNum;
	private String accName;
	private double balance;

	public AccountDTO(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	public double getBalance() {	// get으로 잔액 조회
		return balance;
	}
	
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("출금 금액을 확인하세요.");
			return;		// 종료
		}
		if(this.balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;		// 종료, if else 아님
		}
		this.balance -= money;
	}
	
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액을 확인하세요.");
			return; 	// 종료
		}
		this.balance += money;
	}

}
