package ws0303;

public class Receiving extends Account {

	private String ReceivingType;

	public Receiving() {
	}

	public Receiving(String accName, double rate, double balance, String accType, String receivingType) {
		super(accName, rate, balance, accType);
		ReceivingType = receivingType;
	}
	
	public void deposit(double money) {
		
		if (money<=0) {
			System.out.println("금액 오류입니다. 다시 거래 하시기 바랍니다.");
			return;
		}
			setBalance(getBalance() + money);
			System.out.println(money + "원 입금되었습니다. 현재 잔액은 " + getBalance() + "원 입니다.");
	}
	
	public void withdraw(double money) {
		
		if (money<=0 || getBalance() < money) {
			System.out.println("잔액을 확인하시고 다시 거래하시기 바랍니다."+"현재 잔액은 "+ getBalance() +"원 입니다.");
			return;
		}
			setBalance(getBalance() - money);
			System.out.println(money + "원 출금되었습니다. 현재 잔액은 " + getBalance() + "원 입니다.");
	}

	@Override
	public String toString() {
		return "Receiving [ReceivingType=" + ReceivingType + ", getInterest()=" + getInterest() + ", getAccNum()="
				+ getAccNum() + ", getAccName()=" + getAccName() + ", getRate()=" + getRate() + ", getBalance()="
				+ getBalance() + ", getAccType()=" + getAccType() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
