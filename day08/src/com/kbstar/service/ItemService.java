package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>,
									SearchService{		//interface는 여러개 implement 가능

	DAO<Integer, ItemDTO> dao;	// dao 사용을 위한 객체 선언
	
	public ItemService() {
		dao = new ItemDAO();
	}
	
	@Override
	public void register(ItemDTO v) {
		System.out.println(v + " Data Check...");
		dao.insert(v);
		System.out.println("Send SMS...");
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + " Data Check...");
		dao.delete(k);
		System.out.println("Send SMS...");
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v + " Data Check...");
		dao.insert(v);
		System.out.println("Send SMS...");
	}

	@Override
	public void search() {
		System.out.println("Item Search...");
		
	}

}
