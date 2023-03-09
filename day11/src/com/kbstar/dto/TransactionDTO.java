package com.kbstar.dto;

public class TransactionDTO {
	private String date;
	private String accNo;
	private String balance;
	private String type;	// 입출금 I, O
	private String desc;
	public TransactionDTO() {
	}
	public TransactionDTO(String date, String accNo, String balance, String type, String desc) {
		this.date = date;
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.desc = desc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "거래일시는 " + date + " 계좌번호는 " + accNo + " 잔액은 " + balance + " 입출금 중 " + type
				+ " 거래유형은 " + desc;
	}
	
	
}
