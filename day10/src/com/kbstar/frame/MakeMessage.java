package com.kbstar.frame;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "ER0001" : result = "계좌개설 실패...";
		break;
		case "EX0002" : result = "음수 입력...";
		break;
		case "EX0003" : result = "잔액 부족...";
		break;
		case "EX0004" : result = "ID 중복...";
		break;
		case "EX0005" : result = "ID 중복...";
		break;
		case "EX0006" : result = "ID 중복...";
		break;
		case "ERITEM01" : result = "ITEM ERROR No.1...";
		break;
		case "ERITEM02" : result = "ITEM ERROR No.2...";
		break;
		case "ERITEM03" : result = "ITEM ERROR No.3...";
		break;
		default : result = "고객센터에 문의하세요.";
		}
		return result;
	}
}
