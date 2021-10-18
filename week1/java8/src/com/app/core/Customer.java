package com.app.core;

public class Customer {

	private int id;
	private String name;
	private String mob;
	private String email;
	private String password;
	public int getId() {
		return id;
	}
	
	
	
	
	public Customer() {
		super();
	}




	public Customer(int id, String name, String mob, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.email = email;
		this.password = password;
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
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mob=" + mob + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
