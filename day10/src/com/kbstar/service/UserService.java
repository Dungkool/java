package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {
	
	DAO<String, UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();		// dao 사용하기 위해 객체 선언
	}
	
	@Override
	public void register(UserDTO v) throws Exception {	// DAO에서 받은 exception을 다시 던짐
		System.out.println("Security Check...");		// try - catch 아님(App으로 안가고 Service에서 처리되 버림)
		dao.insert(v);
		System.out.println("Send mail...");
		System.out.println("Send SMS...");
	}

	@Override
	public void remove(String k) throws Exception {		// try - catch로 던지는 방식
		try {											// 이 방식은 로그 남기기 가능
			dao.delete(k);
		} catch (Exception e) {
			// Log 찍기
			throw e;
		}
		System.out.println("Send SMS...");
	}

	@Override
	public void modify(UserDTO v) {
		try {
			dao.update(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Send SMS...");
	}


}
