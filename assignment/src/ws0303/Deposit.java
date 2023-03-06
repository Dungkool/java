package ws0303;

public class Deposit extends Receiving {
	private double transferLimit;
	private double withdrawLimit;
	private String accNumDiff;
	private String accNameDiff;
	//디폴트 컨스트럭터
	public Deposit() {
	}
	//컨스트럭터2
	public Deposit(String accName, double rate, double balance, String accType, String receivingType,
			double transferLimit, double withdrawLimit, String accNumDiff, String accNameDiff) {
		super(accName, rate, balance, accType, receivingType);
		this.transferLimit = transferLimit;
		this.withdrawLimit = withdrawLimit;
		this.accNumDiff = accNumDiff;
		this.accNameDiff = accNameDiff;
	}
	//출금한도 설정
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	@Override
	public void withdraw(double money) {
		if(money > withdrawLimit) {
			System.out.println("출금한도를 초과했습니다. 확인 후 다시 거래 하시기 바랍니다.");
			return;
		}
		super.withdraw(money);
	}
	
	
	//이체한도 설정	
	public void setTransferLimit(double transferLimit) {
		this.transferLimit = transferLimit;
	}


	public void transfer(double money, String accNumDiff, String accNameDiff) {
		if(!accNumDiff.substring(0,4).equals("2023")  || accNameDiff.length() < 3 ) {	// 계좌번호에 2023이 없거나 예금주 길이가 3미만인 경우 
			System.out.println("유효하지 않은 계좌번호/예금주입니다. 재확인 후 시도해주세요.");
			return;
		}
		if (money <= 0 || money > getBalance()) {
			System.out.println("금액 오류입니다. 다시 거래 하시기 바랍니다.");
			return;
		}
		if (money > transferLimit) {
			System.out.println("이체한도를 초과하였습니다.");
			return;
		}
		setBalance(getBalance() - money);
		System.out.println(accNameDiff + "님께" + money + "원이 정상적으로 이체되었습니다. 현재 잔액은 " + getBalance() + "원 입니다.");
	}

	
	
	//출력정보
	@Override
	public String toString() {
		return  "이체한도" + transferLimit + " " + "출금한도" + withdrawLimit + " " + "이체할 계좌번호" + accNumDiff + " "
				+ accNameDiff + getInterest() + getAccNum() + getAccName() + getRate()
				+ getBalance() + getAccType() + getClass()
				+ hashCode() + super.toString();
	}
	
		
}
