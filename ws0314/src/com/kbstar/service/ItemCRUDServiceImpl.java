package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class ItemCRUDServiceImpl implements CRUDService<String, Item> {

	DAO<String, String, Item> dao;

	public ItemCRUDServiceImpl() {
		dao = new ItemDaoImpl();
	}

	@Override
	public void register(Item v) throws Exception {
		try {
			String id = MakeItemNumber.makeItemNum();
			v.setId(id);
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException)
				throw new Exception("ID가 중복되었습니다.");
			else {
				throw new Exception("시스템 장애입니다.");
			}
		}

	}

	@Override
	public void modify(Item v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			} else {
				throw new Exception("해당 ID는 존재하지 않습니다.");
			}
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("네트워크 오류입니다.");
			}
			throw e;
		}
	}

	@Override
	public Item get(String k) throws Exception {
		Item obj = null;
		try {
			obj = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				// e.printStackTrace();
				throw new Exception("존재하지 않는 ID입니다.");
			}
		}
		return obj;
	}

	@Override
	public List<Item> get() throws Exception {
		// 1. 반환받을 바구니(list) 먼저 초기화
		List<Item> list = null;
		try {
			list = dao.selectAll();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애가 발생했습니다."); // 서버오류일 때
			} else {
				throw new Exception("내역이 존재하지 않습니다."); // 조회할 데이터 없을 때
			}
		}
		return list;
	}
}