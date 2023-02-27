package array;

public class P103 {

	public static void main(String[] args) {
		
		// int arr[] = new int[3];
//		int []arr = new int[3]; // 배열을 선언하는 다른 방법
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		
		
		int arr[] = {10,20,30}; // 배열을 선언하는 다른 방법2
		System.out.println(arr);
		

		
		for(int data:arr) {
			System.out.printf("%d \t", data); // 더 간단하지만 일련번호는 못 붙임
		}
	}

}
