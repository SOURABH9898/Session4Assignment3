package com.acadglid.java.core.session4.assignment3;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationTest en=new EncapsulationTest();
		en.setEmail("sourabh.123@abc.com");
		en.setId(11111);
		en.setName("Sourabh");

		
		System.out.println("Employee id : "+ en.getId() + "\nname: "+en.getName()+"\nemail id : "+en.getEmail());
		EncapsulationTest en1=new EncapsulationTest();
		en1.setEmail("sourabh.123@c.com");
		en1.setId(11111);
		en1.setName("Sourabh");
		System.out.println("Employee id : "+ en1.getId() + "\nname: "+en1.getName()+"\nemail id : "+en1.getEmail());
}
}
