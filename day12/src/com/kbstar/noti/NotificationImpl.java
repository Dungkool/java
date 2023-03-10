package com.kbstar.noti;

import com.kbstar.frame.Notification;

public class NotificationImpl implements Notification{

	@Override
	public void SendEmail(String email, String msg) throws Exception {
		System.out.printf("%s로 %s 전송\n", email, msg);
	}

	@Override
	public void SendSMS(String contact, String msg) throws Exception {
		System.out.printf("%s로 %s 전송\n", contact, msg);
	}
	
	
}
