package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Item> Service = new ItemCRUDServiceImpl();
		Item obj = new Item("202331425100", "miumiu", 5000, 5.5, null);
		try {
			Service.modify(obj);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
