package com.git.model.vo;

public class person {
	//회원정보 저장하는 클래스 
	private String name;
	private int age;
	private String address;
	private double height; 
	
	public person() {}

//	public person(String name, int age, String address, double height) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	
	
}
