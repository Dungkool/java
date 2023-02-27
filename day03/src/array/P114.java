package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) { //arr.length는 4(5개), 배열의 가로 길이
			for(int j=0; j<arr[i].length; j++){    // 배열의 세로 길이
				arr[i][j] = r.nextInt(9)+1;
			}
		}
		System.out.println(Arrays.toString(arr)); // 바깥 배열을 출력해서 제대로 값이 안 나옴
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d \t", (arr[i][j]));
			}
			System.out.println("");				// j가 5번 돌고나서 줄바꿈을 위해서
		}
			// 위의 내용을 for-each로 변경하세요.
		System.out.println("----------------------------------");	
		
			for(int[] a:arr) {
				for(int data: a) {
					System.out.printf("%d \t", data);
				}
				System.out.println("");
			}
			
			
			
			
		
		
		
		
	}

}
