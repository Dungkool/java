package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;

public class TransactionDAO implements DAO<String, TransactionDTO> {

	HashMap<String, TransactionDTO> db;

	public TransactionDAO() {
		db = new HashMap<String, TransactionDTO>();
	}

	@Override
	public void insert(TransactionDTO v) throws Exception {
		if (db.containsKey(v.getDate())) {
			throw new Exception("DB Error");
		}
		db.put(v.getDate(), v);
	}

	@Override
	public void delete(String k) throws Exception {
	}

	@Override
	public void update(TransactionDTO v) throws Exception {
	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception("DB Error");
		}
		TransactionDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();
		for (TransactionDTO obj : col) {
			list.add(obj);
		}
		return list;
	}

	
	// 고객의 보유한 계좌번호를 입력하면, 해당 거래내역 조회
	
	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		Collection<TransactionDTO> col = db.values();
		for (TransactionDTO tr : col) { // acc의 holder가 id값과 같음
			// 거래내역 중에서 accNo가 obj와 같은 것들만 넣어야 함
			if (tr.getAccNo().equals(obj)) {
				list.add(tr);
			}
		}
		return list;
	}

}
