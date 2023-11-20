package com.Abstraction;

abstract class Shape {
	protected abstract void draw();
}

class Circle extends Shape {
	protected void draw() {
		System.out.println("Drawing circles");
	}
}

class Square extends Shape {
	protected void draw() {
		System.out.println("Drawing squares");
	}
}

public class ShapeProgram {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();

		Square s = new Square();
		s.draw();
	}
}
