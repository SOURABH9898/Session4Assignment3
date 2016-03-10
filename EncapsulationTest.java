package com.acadglid.java.core.session4.assignment3;

public class EncapsulationTest {
	private final String domain="abc.com";
	private int id;
	private String name;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("@")&& email.contains(domain)){
			this.email = email;
		}else{
			System.out.println("Invalid email");
		}
		
	}
	

}
