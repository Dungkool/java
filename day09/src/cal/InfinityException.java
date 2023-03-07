package cal;

public class InfinityException extends Exception { // 모든 exception은 Exception에서 상속받아야 함
	public InfinityException() {

	}

	public InfinityException(String msgcode) {
		super(msgcode);
	}
}