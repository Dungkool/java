package bank;

public class WithdrawException extends Exception {
	public WithdrawException() {
	}
	public WithdrawException(String msgcode) {
		super(msgcode);
	}
}
