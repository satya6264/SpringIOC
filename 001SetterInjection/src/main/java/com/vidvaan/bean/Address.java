package com.vidvaan.bean;

public class Address {
	
	private int aid;
	private String aloc;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAloc() {
		return aloc;
	}
	public void setAloc(String aloc) {
		this.aloc = aloc;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + "]";
	}
	
	

}
