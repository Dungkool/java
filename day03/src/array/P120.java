package array;

public class P120 {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int data:a) {				// int data < 배열에서 꺼낼 내용 (배열 a와 같은 형식이어야 함)
			sum += data;
		}
		
		avg = (sum*1.0) / a.length;
		
		System.out.printf("%d, %4.2f", sum, avg);
	}

}
