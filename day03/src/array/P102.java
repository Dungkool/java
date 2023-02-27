package array;

public class P102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		
		int arr[] = new int[3]; // new는 레퍼런스 타입
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr); // new가 레퍼런스 타입이라 그냥 출력이 안됨
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d \t", arr[i]); // 구방식이나 일련번호 붙이기 가능
		}
		
		System.out.println("Type2");
		for(int data:arr) {
			System.out.printf("%d \t", data); // 더 간단하지만 일련번호는 못 붙임
		}
	}

}
