package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	// Constructor - 음수 예외 상황
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}
	
	public Account(String name, String accHolder, double balance) throws Exception {
		this();
		this.name = name;
		this.accHolder = accHolder;
		if(balance < 0) {
			throw new Exception("가입금액 오류입니다.");
		}else {
			this.balance = balance;
		}
	}

	public Account(String accNo, String name, String accHolder, double balance) throws Exception {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		if(balance < 0) {
			throw new Exception("가입금액 오류입니다.");
		}else {
			this.balance = balance;
		}
	}
	// 계좌 정보 조회



	// 잔액 조회
	public double getbalance() {
		return balance;
	}

	// 입금 - 음수 예외 상황
	public void deposit(double money) throws DepositException {
		if (money <= 0) {
			throw new DepositException("입금금액 오류입니다.");
		}
		balance += money;
	}

	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황

	public void withdraw(double money) throws WithdrawException {
		if (money <= 0) {
			throw new WithdrawException("출금금액 오류입니다.");
		}
		if (balance < money) {
			throw new WithdrawException("잔액이 부족합니다.");
		}
		balance -= money;
	}

	@Override
	public String toString() {
		return "계좌번호 : " + accNo + " / 계좌명 : " + name + "  / 예금주 : " + accHolder + " / 잔액 : " + balance + "원 입니다.";
	}

}
