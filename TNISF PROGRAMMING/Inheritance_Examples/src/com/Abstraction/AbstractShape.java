package com.Abstraction;

abstract class Shapes{
	String color;
	
	Shapes(String color){
		this.color = color;
	}
	
	abstract void draw();
	
}
class Circle1 extends Shapes{
	Circle1(String color){
		super(color);
	}
	
	void draw() {
		System.out.println("Drawing a "+color+" circle");
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		Circle1 c1 = new Circle1("Blue");
		c1.draw();
	}
}
