package ws0303;

public class App {
	
	public static void main(String[] args) {
	
		Deposit dps = new Deposit("김국민", 0.15, 6000000, "Receiving", "Deposit", 500000, 500000, "2023", "조현손");
		System.out.println(dps);
		
		dps.transfer(100000, "202315", "조현손");
		
	}
}

