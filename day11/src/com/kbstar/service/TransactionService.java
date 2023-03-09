package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

public class TransactionService implements CRUDService<String, TransactionDTO> {

	DAO<String, TransactionDTO> transactionDao;
	Notification notification;

	public TransactionService() {
		transactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		try{
			transactionDao.insert(v);
		}catch(Exception e){
			throw new Exception("ERROR");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		transactionDao.delete(k);
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		transactionDao.update(v);
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		obj = transactionDao.select(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		list = transactionDao.select();
		return list;
	}

}
