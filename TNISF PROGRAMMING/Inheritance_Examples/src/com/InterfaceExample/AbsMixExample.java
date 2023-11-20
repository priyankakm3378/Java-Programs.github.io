package com.InterfaceExample;

interface Engine{
	void start();
}

abstract class Vehicle{
	abstract void accelerate();
}

class Car extends Vehicle implements Engine{
	
	@Override
	 void accelerate() {
		System.out.println("Car is accelerating");
	}
	 public void start() {
			System.out.println("Car is started");
	}
	 
}

public class AbsMixExample {
	
	public static void main(String[] args) {
	Car c = new Car();
	
	c.start();
	c.accelerate();
	}

}
