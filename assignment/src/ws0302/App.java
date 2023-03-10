package ws0302;

public class App {

	public static void main(String[] args) {
		
		Account acc[] = new Account[6];
		
		acc[0] = new Account("james1", 10000, 0.35, "VIP");
		acc[1] = new Account("james2", 10000, 0.45, "GOLD");
		acc[2] = new Account("james3", 10000, 0.55, "SIVER");
		acc[3] = new Account("james4", 10000, 0.15, "GOLD");
		acc[4] = new Account("james5", 10000, 0.28, "SIVER");
		acc[5] = new Account("james6", 10000, 0.31, "VIP");
		
		for(Account data : acc) {
			System.out.println(data);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for(Account data2 : acc) {
			System.out.printf("잔액은 %4.2f원 \t",data2.getBalance());
			System.out.printf("이자는 %1.2f원 입니다. \n",data2.getInterest());
		}
		
		System.out.println("-----------------------------------------------------------");
		
		double balanceSum = 0;
		double balanceAvg = 0.0;
		int cnt = 0;
		for(int i=0; i < acc.length; i++) {
	    	if(acc[i].getGrade().equals("VIP")) {
	    		balanceSum += acc[i].getBalance();
	    		cnt++;
	    	}
	    }
		balanceAvg = balanceSum / cnt;
		
		System.out.printf("VIP의 잔액 합계는 %1.2f원, 평균 잔액은 %1.2f원 입니다.", balanceSum, balanceAvg);
	}

}
