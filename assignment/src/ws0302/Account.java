package ws0302;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;
	
	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();	// MakeAccountNumber가 static인 경우
	}													// 객체 생성없이 바로 사용 가능

	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}
	
	public Account(String accNum, String accName, double balance) {
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
	
	public String getGrade() {
		return grade;
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
	
	public double getInterest() {
		double result = 0.0;
		result = balance * rate;
		return result;
	}

}
