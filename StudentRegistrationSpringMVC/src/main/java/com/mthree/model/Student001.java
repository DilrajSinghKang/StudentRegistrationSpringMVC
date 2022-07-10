package com.mthree.model;

public class Student001 {
	private String username;
	private int userage;
	private int usermobile;
	private String useraddress;
	
	public Student001() { }//constructor	 

	public Student001(String username, int userage, int usermobile, String useraddress) {
	super();
	this.username = username;
	this.userage = userage;
	this.usermobile = usermobile;
	this.useraddress = useraddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserage() {
		return userage;
	}

	public void setUserage(int userage) {
		this.userage = userage;
	}

	public int getUsermobile() {
		return usermobile;
	}

	public void setUsermobile(int usermobile) {
		this.usermobile = usermobile;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", userage=" + userage + ", usermobile=" + usermobile
				+ ", useraddress=" + useraddress + "]";
	}


}
