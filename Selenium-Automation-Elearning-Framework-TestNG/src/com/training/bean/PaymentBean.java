package com.training.bean;

public class PaymentBean {
	private String login;
	private String amount;
	private String desc;

	public PaymentBean() {
	}

	public PaymentBean(String login, String amount, String desc) {
		super();
		this.login = login;
		this.amount = amount;
		this.desc = desc;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "PaymentBean [login=" + login + ", amount=" + amount  + " , desc=" + desc + "]";
	}

}

