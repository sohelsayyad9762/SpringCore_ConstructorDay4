package com.tech;

public class Student2 {
	
	private String email;
	private int id;
	private String name;
	private int phone;
	
	
	public Student2(String email, int id, String name, int phone) {
		super();
		this.email = email;
		this.id = id;
		this.name = name;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Student2 [email=" + email + ", id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	

	
}
