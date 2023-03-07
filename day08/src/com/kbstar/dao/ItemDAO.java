package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {	// ItemDTO의 key 값 Integer(primitive type형태인 int라고 못 씀)
														// 그리고 ItemDTO
	@Override
	public void insert(ItemDTO v) {
		connect();	// DAO에서 connect 가져옴
		System.out.println(v);
		System.out.println("Inserted...");
		close();
	}

	@Override
	public void delete(Integer k) {
		connect();
		System.out.println(k);
		System.out.println("Deleted...");
		close();
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated...");
	}	
}
