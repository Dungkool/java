package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();

		for (int i = 1; i <+ 10; i++) {
			int num = r.nextInt(10) + 1;
			list.add(num);
		}
		
		list.add(1, 100);
		list.remove(1);
// 		list.add(10);
//		list.add(20);
//		list.add(30);
		for (int data : list) {
			System.out.println(data);
		}
	}

}
