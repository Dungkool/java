package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> { // generic의 type 선언

	@Override
	public void insert(UserDTO v) throws Exception {
		if (v.getId().equals("id01")) {
			throw new Exception("EX0004");		// interface에서도 throws 선언 필요
		}
		System.out.println(v.getId() + "님이 저장되었습니다.");
	}

	@Override
	public void delete(String k) throws Exception {
		if (k.equals("id01")) {
			throw new Exception("EX0005");		// interface에서도 throws 선언 필요
		}
		System.out.println(k + "님이 삭제되었습니다.");
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if (v.getId().equals("id01")) {
			throw new Exception("EX0006");		// interface에서도 throws 선언 필요
		}
		System.out.println(v.getId() + "님의 정보가 수정되었습니다.");
	}

}
