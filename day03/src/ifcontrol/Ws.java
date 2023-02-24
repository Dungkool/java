package ifcontrol;

public class Ws {

	public static void main(String[] args) {
		// 1~100까지의 숫자 중
		// 3의 배수의 합과 평균을 구하시오.
		// 4의 배수의 합과 평균을 구하시오.
		// 7의 배수의 합과 평균을 구하시오.

		int sum1 = 0, sum2 = 0, sum3 = 0;
		double avg1 = 0, avg2 = 0, avg3 = 0;
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		
		
		for(int i = 1; i <= 100; i++) {			// i가 for문 안에서만 사용
			if(i%3 == 0) {
				sum1 += i;
				cnt1++;
				}
			if(i%4 == 0) {
				sum2 += i;
				cnt2++;
				}
			if(i%7 == 0) {
				sum3 += i;
				cnt3++;
				}
		}
		
		avg1 = (sum1 * 1.0)/cnt1;
		avg2 = (sum2 * 1.0)/cnt2;
		avg3 = (sum3 * 1.0)/cnt3;
		
		System.out.printf("%d, %4.2f \n", sum1, avg1);
		System.out.printf("%d, %4.2f \n", sum2, avg2);
		System.out.printf("%d, %4.2f \n", sum3, avg3);
		
		// while로 하기
		int sum4 = 0, sum5 = 0, sum6 = 0;
		double avg4 = 0, avg5 = 0, avg6 = 0;
		int cnt4 = 0, cnt5 = 0, cnt6 = 0;
		
		int i = 1;
		while(i <= 100) {			// i가 for문 안에서만 사용
			if(i%3 == 0) {
				sum4 += i;
				cnt4++;
				}
			if(i%4 == 0) {
				sum5 += i;
				cnt5++;
				}
			if(i%7 == 0) {
				sum6 += i;
				cnt6++;
				}
		}
		
		avg4 = (sum4 * 1.0)/cnt4;
		avg5 = (sum5 * 1.0)/cnt5;
		avg6 = (sum6 * 1.0)/cnt6;
		
		System.out.printf("%d, %4.2f \n", sum4, avg4);
		System.out.printf("%d, %4.2f \n", sum5, avg5);
		System.out.printf("%d, %4.2f \n", sum6, avg6);
	}

}
