package com.vidvaan.student.bean;

public class Student {
	
	private int sid;
	private String sname;
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	

}
