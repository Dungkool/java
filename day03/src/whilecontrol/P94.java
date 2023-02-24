package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		
		// 합과 평균을 구하시오
		
		System.out.println("Start.....");
		
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= 10; i++) {			// i가 for문 안에서만 사용
			if(i%2 == 0) {
				sum += i;
				cnt++;
				}
			if(i == 8) {
				break;
			}
		}

//		홀수를 제외하는 방식으로 구하는 법
//		for(int i = 1; i <= 100; i++) {			// i가 for문 안에서만 사용
//			if(i%2 != 0) {
//				continue;
//				}
//				sum += i;
//				cnt++;
//		}
		
		avg = sum / (cnt * 1.0);
		
		System.out.printf("%d, %4.2f \n", sum, avg);
		System.out.println("End.....");
	}

}
