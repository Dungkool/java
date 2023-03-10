package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();

		// Register
		UserDTO user = new UserDTO("ID01", "pwd01", "김국민", "123@456.com", "010-1111-2222");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Login

		String id = "ID01";
		String pwd = "pwd011";
		UserDTO loginUser = null;
		try {
			loginUser = service.login(id, pwd);
			System.out.println(loginUser);
			System.out.println("Login OK~~~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
