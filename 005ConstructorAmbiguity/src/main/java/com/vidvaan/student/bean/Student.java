package com.vidvaan.student.bean;

public class Student {
	
	private int sid=1;
	private String sname="none";
	private double sfee = 0.0;
	private String course="java";
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Student(double sfee, String course) {
		super();
		this.sfee = sfee;
		this.course = course;
	}

	public Student(int sid, String sname, double sfee, String course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", course=" + course + "]";
	}
	
	

}
