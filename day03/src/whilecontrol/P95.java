package whilecontrol;

public class P95 {

	public static void main(String[] args) {
		
		// 합과 평균을 구하시오
		
		System.out.println("Start.....");
		
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		int i = 1;
		while(i <= 10) {
			if(i%2 == 0) {
				sum += i;
				cnt++;
			}if(i==8) {
				break;
			}
			i++;  // if 밖에 있어야 증가할 수 있음

		}

		
		avg = (sum * 1.0) / cnt;
		
		System.out.printf("%d, %4.2f \n", sum, avg);
		System.out.println("End.....");
	}

}
