package ws0303;

public class Account {
	
	private String accNum;
	private String accName;
	private double rate;
	private double balance;
	private String accType;
	
	public Account() {
		accNum = MakeAccountNumber.makeAccNum();
	}
	
	public Account(String accName, double rate, double balance, String accType) {
		this();
		this.accName = accName;
		this.rate = rate;
		this.balance = balance;
		this.accType = accType;
	}
	
	// 메소드
	public double getInterest() {
		double result=0.0;
		result = balance*rate;
		return result;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	
}
