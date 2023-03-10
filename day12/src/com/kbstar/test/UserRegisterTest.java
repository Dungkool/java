package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService(); // UserService 테스트 위해 사용 선언

		UserDTO obj1 = new UserDTO("id01", "pw01", "James", "111@kbstar.com", "010-1111-1111");
		UserDTO obj2 = new UserDTO("id02", "pw01", "James", "222@kbstar.com", "010-2222-2222");
		UserDTO obj3 = new UserDTO("id03", "pw01", "James", "333@kbstar.com", "010-3333-3333");

		// insert test
		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		// get test
		UserDTO user = null; // UserDTO 형식의 갑을 받기 위해 선언 및 초기화
		try {
			user = service.get("id01"); // UserDTO 형식의 값이 나옴
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// get() test - 전체 조회
		List<UserDTO> list = null;
		try {
			list = service.get();
			for (UserDTO u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// remove test

		try {
			service.remove("id05");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
