package com.vidvaan.bean;

public class DBConnection {
	
	private String url,driver,uname,pass;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void getConnectionDetails() {
		System.out.println("Database details are: ");
		System.out.println("Url : "+url);
		System.out.println("Driver : "+driver);
		System.out.println("UserName : "+uname);
		System.out.println("Passsword : "+pass);
		
	}
	

}
