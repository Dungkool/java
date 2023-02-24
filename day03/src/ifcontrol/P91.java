package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// 두 수의 최대값과 최소값을 구하시오.
		
		int max = 0;
		int min = 0;
		
		if(a >= b) {
			max = a; min = b;
		}else {
			max = b; min =a;
		}
		
		System.out.printf("MAX : %d, MIN : %d", max, min);
		
	}
}
