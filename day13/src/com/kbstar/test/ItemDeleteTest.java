package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemDeleteTest {

	public static void main(String[] args) {
		CRUDService<String, Item> Service = new ItemCRUDServiceImpl();
		Item item = null;
		try {
			item = Service.get("202331499710055");
			System.out.println(item);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
