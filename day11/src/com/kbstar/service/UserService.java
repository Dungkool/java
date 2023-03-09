package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {

	DAO<String, UserDTO> userDao; // 상위 Interface인 Service가 바라보는(사용하는) DAO를 쓰기 위해 DAO 선언
	Notification notification; // 상위 Interface인 Service가 바라보는(사용하는) Notification을 쓰기 위해 Notification을 선언

	public UserService() {
		userDao = new UserDAO(); // 객체 선언
		notification = new NotificationImpl(); // 객체 선언 실행을 위해 Impl을 선언해야 함
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v); // UserDAO에서 insert 함수 실행
		} catch (Exception e) {
			throw new Exception("중복된 ID입니다.(EX0001)"); // throw를 해야 에러 발생시 아래로 안 가고 여기서 끝남
		}
		notification.SendEmail(v.getEmail(), Msg.registerMsg1); // notification(impl)에서 SendEmail 함수 실행
		notification.SendSMS(v.getContact(), Msg.registerMsg2); // notification(impl)에서 SendSMS 함수 실행
	}

	@Override
	public void remove(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		
		try{
			userDao.delete(k);
		}catch(Exception e) {
			throw new Exception("회원탈퇴 오류입니다.");
		}
		notification.SendEmail(user.getEmail(), Msg.registerMsg3);
		notification.SendSMS(user.getContact(), Msg.registerMsg4);
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try{
			userDao.update(v);
		}catch(Exception e) {
			throw new Exception("수정 오류입니다.");
		}
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null; // UserDTO 형식의 값을 가져올 것이다.
		obj = userDao.select(k); // userDao의 select 함수 사용해서 obj에 넣음
		return obj; // obj 반환
	}

	@Override
	public List<UserDTO> get() throws Exception {
		List<UserDTO> list = null;
		try {
			list = userDao.select();
		} catch (Exception e) {
			throw new Exception("조회 오류");
		}
		return list;
	}

}
