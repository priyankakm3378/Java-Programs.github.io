package com.javaEncapsulation;

public class Area {
private int length;
private int breadth;

int area;

public void setLength(int length) {
	this.length = length;
}

public void setBreadth(int breadth) {
	this.breadth = breadth;
}

public int getLength() {
	return length;
}
	
public int getBreadth() {
	return breadth;
}

public Area(int length,int breadth) {
	this.length = length;
	this.breadth = breadth;
}

public int getArea() {
	
	return area = length * breadth;	
}

public Area() {
	super();
}

public static void main(String[] args) {
	Area a = new Area();
	a.setLength(85);
	a.setBreadth(75);
	
	System.out.println("Area : "+a.getArea());
	
	Area a1 = new Area(20,20);
	System.out.println(a1.getArea());
	
}
}
