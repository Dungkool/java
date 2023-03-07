package com.kbstar.app;

import com.kbstar.dao.AccountMariaDBDAO;
import com.kbstar.dao.AccountOracleDAO;
import com.kbstar.dao.UserOracleDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;

import come.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
		DAO dao = new AccountMariaDBDAO();		// Account, User 바꾸면 적용 클래스가 바뀜
		AccountDTO account = new AccountDTO("100", "자유저축", 1000);
		System.out.println(account);
		
//		UserDTO user = new UserDTO("id01", "pw01", "James");
//		dao.insert(user);

		
	}

}
