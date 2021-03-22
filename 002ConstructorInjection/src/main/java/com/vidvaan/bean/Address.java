package com.vidvaan.bean;

public class Address {
	
	private int aid;
	private String aloc;
	   
	
	
	public Address(int aid, String aloc) {
		super();
		this.aid = aid;
		this.aloc = aloc;
	}



	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + "]";
	}
	
	

}
