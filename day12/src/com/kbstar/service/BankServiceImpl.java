/**
 * 
 */
package com.kbstar.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author jhs41
 *
 */
public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;

	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		transactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록 오류");
		}
		notification.SendEmail(v.getEmail(), "축하합니다.");
		notification.SendSMS(v.getContact(), "축하합니다.");
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		if (user != null) {
			if (user.getPwd().equals(p)) {
				System.out.println("OK");
			} else {
				throw new Exception("로그인 실패...");
			}
		} else {
			throw new Exception("로그인 실패...");
		}

		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		AccountDTO account = new AccountDTO(MakeAccountNumber.makeAccNum(), balance, k);
		accountDao.insert(account);
		UserDTO user = userDao.select(k);
		notification.SendEmail(user.getEmail(), account.getAccNo() + " 계좌를 개설하였습니다.");
		notification.SendSMS(user.getContact(), account.getAccNo() + " 계좌를 개설하였습니다.");
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		return transactionDao.search(acc);
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		// 계좌정보 수정
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc);
		double abalance = acc.getBalance() - balance;
		acc.setBalance(abalance);
		accountDao.update(acc);

		// 거래내역 추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc);
		transactionDao.insert(tr);

		// SMS, email 전송
		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		notification.SendEmail(u.getEmail(), sendAcc + "에서" + balance + "원이 출금되었습니다.");
		notification.SendSMS(u.getContact(), sendAcc + "에서" + balance + "원이 출금되었습니다.");
		// 완료
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = null;
		list = accountDao.search(k);
		return list;
	}

}
