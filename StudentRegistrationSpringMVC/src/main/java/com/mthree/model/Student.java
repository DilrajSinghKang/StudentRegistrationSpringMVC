package com.mthree.model;

//source-generate constructor using fields
public class Student {// three variables
	private int id;
	private String fname;
	private String age;
	private String  mobile;
	private String  address;
	public Student() {//constructor
		
	}
	public int getId() {
		return id;
	}

	public Student(int id, String fname, String age, String mobile, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", age=" + age + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

	
}
