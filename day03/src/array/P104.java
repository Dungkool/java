package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
//			int data = r.nextInt(99)+1;
//			arr[i] = data; 				간단하게 쓰면 아래처럼 됨
			
		 arr[i] = r.nextInt(99)+1;
		}
		
		System.out.println(Arrays.toString(arr));   // 배열 한 번에 출력하기
		
		// 배열의 합과 평균을 구하시오.
		
		int sum = 0;
		for(int a:arr) {
			sum += a;
		}
		double avg = 0.0;
		avg = (sum * 1.0) / arr.length;
		
		System.out.printf("%d, %4.2f", sum ,avg);
		
//		int sum = 0;
//		double avg = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i]; 
//		}
//		
//		avg = (sum * 1.0)/arr.length;
//		System.out.println("");
//		System.out.println(sum);
//		System.out.println(avg);
		
		
		
		}

}
