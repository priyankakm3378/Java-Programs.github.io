package com.javaEncapsulation;

public class Human {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public static void main(String[] args) {
		Human h = new Human();
		h.setName("Priyanka");
		h.setAge(22);
		
		System.out.println("Name : "+h.getName());
		System.out.println("Age : "+h.getAge());
		
	}

}
