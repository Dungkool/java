package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

import bank.MakeMessage;

public class App2 {

	public static void main(String[] args) {

		Service<Integer, ItemDTO> service = new ItemService(); // App2에서 Service를 사용
		SearchService search = new ItemService(); // SearchService라는 인터페이스 사용하기 위한 선언
		// ItemService service = new ItemService(); // search를 사용하기 위해 선언, 인터페이스 방식이 아님
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Input command(q, i, d, u, s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;

			} else if (cmd.equals("s")) {
				search.search();

			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = sc.nextInt();
				System.out.println("Input Name...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = sc.nextDouble();
				System.out.println("Input Quantity...");
				int qt = sc.nextInt();

				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					service.register(item);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println(com.kbstar.frame.MakeMessage.makeMessage(e.getMessage()));
				}

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				try { // try-catch 구문 : exception 발생 시 처리 방법
					int id = sc.nextInt();
					service.remove(id);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}

			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = sc.nextInt();
				System.out.println("Input Name...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = sc.nextDouble();
				System.out.println("Input Quantity...");
				int qt = sc.nextInt();

				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					service.modify(item);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			}
		}
		sc.close();
	}
}
