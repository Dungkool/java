package remote;

public class Human {

	public static void main(String[] args) {
		Remote remote = new Audio();	// 사람은 remote를 가지고 있다.
		remote.turnOn();
		remote.turnOff();
	}

}
