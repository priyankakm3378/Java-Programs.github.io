package com.javaEncapsulation;

public class Person {

	private double id;
	private String name;
	
	private void sayHello() {
		System.out.println("Hello method"+getId());
	}
	
	public Person() {
		id = Math.random();
		sayHello();
	}
	
	public double getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
