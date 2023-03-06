package com.kbstar.dao;

import com.kbstar.dto.AdminDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class AdminDAO implements DAO<String, AdminDTO>{	// generic의 type 선언

	@Override
	public void insert(AdminDTO v) {
		System.out.println(v.getId() + "님이 저장되었습니다.");
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "님이 삭제되었습니다.");		
	}

	@Override
	public void update(AdminDTO v) {
		System.out.println(v.getId() + "님의 정보가 수정되었습니다.");
	}

	
}
