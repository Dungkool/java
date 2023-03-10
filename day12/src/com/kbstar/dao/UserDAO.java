package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {

	HashMap<String, UserDTO> db; // DB 선언

	public UserDAO() { // Constructor에서 DB 사용을 위한 선언
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {
			throw new Exception("DB ERROR");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("존재하지 않는 ID입니다.");
		}
		db.remove(k);
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if (!db.containsKey(v.getId())) {
			throw new Exception("존재하지 않는 ID입니다.");
		}
		db.put(v.getId(), v);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null; // UserDTO 형식은 반환 값도 UserDTO이므로 선언 후 초기화
		obj = db.get(k); // get을 통해 key값 입력 후 모든 정보(v) 반환 후 obj에 입력
		return obj; // obj를 return
	}

	@Override
	public List<UserDTO> select() throws Exception { // List(인터페이스)에 UserDTO를 담아서 보냄
		ArrayList<UserDTO> list = new ArrayList<UserDTO>(); // List는 인터페이스이므로 ArrayList에 UserDTO를 담음
		Collection<UserDTO> col = db.values(); // db에서 values를 통해 모든 값을 가져와서 col에 넣음
		for (UserDTO obj : col) {
			list.add(obj); // col을 list에 하나씩 담음
		}
		return list;
	}

	@Override
	public List<UserDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
