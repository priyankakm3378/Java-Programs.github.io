package com.javaOops;

public abstract class Employee {
	private String name;
	private int paymentPerHour;
	
	public abstract int calculateSalary();
	
	public String getName() {
		return name;
	}
	
	public int getPaymentPerHour(){
		return paymentPerHour;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPayment(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
	
	public Employee(String name,int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}
}
