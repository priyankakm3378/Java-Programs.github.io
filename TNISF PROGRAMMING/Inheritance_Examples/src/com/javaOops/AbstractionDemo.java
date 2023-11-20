package com.javaOops;

public class AbstractionDemo {

	public static void main(String[] args) {
		Employee ec = new Contractor("contractor",10,10);
		Employee ftme = new FullTimeEmployee("Full time employee",8);
		
		System.out.println(ec.calculateSalary());
		
		System.out.println(ftme.calculateSalary());
		
		
	}

}
