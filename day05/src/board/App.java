package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();	// Service 객체 생성, Service를 이용하겠다.
		while(true) {
			System.out.println("Input cmd(r, m, d, g, q)");
			String cmd = sc.next();
			if(cmd.equals("q")){
				System.out.println("Bye.");
				break;
			}else if(cmd.equals("r")) {
				System.out.println("Input contents");
				String content = sc.next();
				service.register(content); 		// 글을 등록하는 기능을 연결
			}else if(cmd.equals("g")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);	// get은 결과가 반환되므로 글을 조회하는 기능을 연결 후
				System.out.println(result);			// 글을 출력
			}else if(cmd.equals("d")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				service.remove(num);		// 글을 삭제하는 기능을 연결
			}else if(cmd.equals("m")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				System.out.println("Input contents");
				String str = sc.next();
				service.modify(num, str);		// 글을 수정하는 기능을 연결
			}
			
		}
		sc.close();
		
	}

}
