package com.kbstar.frame;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "ER0001" : result = "계좌개설 실패...";
		break;
		case "EX0002" : result = "음수 입력...";
		break;
		default : result = "고객센터에 문의하세요.";
		}
		return result;
	}
}