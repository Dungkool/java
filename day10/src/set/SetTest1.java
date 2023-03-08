package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		// 1~10까지의 숫자를 10개 입력하세요.

//		for (int i = 0; i < 10; i++) {		중복되면 값이 사라지므로 10개가 안 들어감
//			int num = r.nextInt(10) + 1;
//			set.add(num);
//		}		
		
		while(set.size()<10) {
			int num = r.nextInt(10) + 1;
			set.add(num);
		}
		
		
		System.out.println(set.size());
		System.out.println("-------------------------");
		for (int data : set) {
			System.out.println(data);
		}
	}

}
