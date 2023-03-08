package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		// List<Integer> list = new ArrayList<Integer>();

		// 1~10까지의 숫자를 20개 입력한다.
		// 단 while문을 이용한다.
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		
	
		while (list.size() < 20) {
			int data = r.nextInt(10) + 1;
			list.add(data);
		}
		System.out.println(list.size());
		System.out.println("--------------------");
		for (int data : list) {
			System.out.println(data);
		}

	}

}
