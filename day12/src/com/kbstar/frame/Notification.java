package com.kbstar.frame;

public interface Notification {
	public void SendEmail(String email, String msg) throws Exception; // 함수
	public void SendSMS(String contact, String msg) throws Exception; // 함수
}