package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.AccountService;

public class AccountRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService(); // UserService 테스트 위해 사용 선언

		AccountDTO obj1 = new AccountDTO(MakeAccountNumber.makeAccNum(), 10000, "김국민");
		AccountDTO obj2 = new AccountDTO(MakeAccountNumber.makeAccNum(), 20000, "김신한");
		AccountDTO obj3 = new AccountDTO(MakeAccountNumber.makeAccNum(), 30000, "김우리");

		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("------------------------------------------------");

		try {
			service.remove("202339100");
			System.out.println("계좌가 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("------------------------------------------------");

		try {
			AccountDTO accInfo = null;
			accInfo = service.get("202339102");
			System.out.println(accInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("------------------------------------------------");

		obj3 = new AccountDTO("202339102", 10000, "김하나");
		try {
			service.modify(obj3);
			System.out.println("계좌정보가 변경되었습니다.");
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		System.out.println("------------------------------------------------");

		List<AccountDTO> list = null;
		try {
			list = service.get(); // 빈 괄호는 전체
			for (AccountDTO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
