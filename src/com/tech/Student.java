package com.tech;

public class Student {
	
	private int id;
	private String name;
	private String email;
	
	public Student() {
		System.out.println("Constructor parameterless.........");
	}

	public Student(int id) {
		System.out.println("Constructor one parameter int...");
		this.id = id;
	}

	public Student(String name) {
		System.out.println("Constructor one parameter String...");
		this.name = name;
	}

	public Student(int id, String name) {
		System.out.println("Constructor two parameter int and String");
		this.id = id;
		this.name = name;
	}
	
	

	public Student(String name, String email) {
		System.out.println("Constructor two parameter String and String");
		this.name = name;
		this.email = email;
	}
	
	

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	

	
	

	
	
	
}
