package com.kbstar.dto;

public class TransactionDTO {
	private String date;
	private String accNo;
	private double balance;
	private String type;	// 입출금 I, O
	private String desc;
	public TransactionDTO() {
	}
	public TransactionDTO(String date, String accNo, double balance, String type, String desc) {
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
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
		return "거래일시는 " + date + " 계좌번호는 " + accNo + " 이체금액은 " + balance + " 거래유형은 " + type
				+ " 적요는 " + desc;
	}
	
	
}
