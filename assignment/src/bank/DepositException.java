package bank;

public class DepositException extends Exception {
	public DepositException() {
	}
	public DepositException(String msgcode) {
		super(msgcode);
	}
}
