package com.tcs.demo1.controller;

public class User{
	private int id;
	private String name;
	private String address;
	private int phone;
	private String email;
	public User(int id, String name, String address, int phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ "]";
	}

}
