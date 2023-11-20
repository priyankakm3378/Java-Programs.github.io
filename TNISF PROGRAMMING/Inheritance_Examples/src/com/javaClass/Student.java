package com.javaClass;

public class Student {
	private String name;
	private String college;
	
	
	public Student(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCollege() {
		return college;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Ram","SKSV");
		Student s2 = new Student("Amogh","STPMB");
		Student s3 = new Student("Anu","Govt. Kpl");
		
		System.out.println(s1.getName()+" "+s1.getCollege());
		System.out.println(s2.getName()+" "+s2.getCollege());
		System.out.println(s3.getName()+" "+s3.getCollege());
		
		
	}
	
}
