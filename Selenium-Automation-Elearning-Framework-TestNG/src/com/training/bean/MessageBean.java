package com.training.bean;

public class MessageBean {
	private String memlogin;
	private String subject;
	private String bodytxt;

	public MessageBean() {
	}

	public MessageBean(String memlogin, String subject, String bodytxt) {
		super();
		this.memlogin = memlogin;
		this.subject = subject;
		this.bodytxt = bodytxt;
	}

	public String getMemlogin() {
		return memlogin;
	}

	public void setMemlogin(String memlogin) {
		this.memlogin = memlogin;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBodytxt() {
		return bodytxt;
	}
	public void setBodytxt(String bodytxt) {
		this.bodytxt = bodytxt;
	}
}