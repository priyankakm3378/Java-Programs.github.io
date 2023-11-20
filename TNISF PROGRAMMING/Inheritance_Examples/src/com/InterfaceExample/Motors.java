package com.InterfaceExample;

abstract class VehicleType{
	String type;
	
	VehicleType(String type){
		this.type = type;
	}
	
	abstract void start();
}

class CarType extends VehicleType{
	
	CarType(){
		super("Audi");
	}
	void start() {
		System.out.println(type + " is Starting");
	}
}


public class Motors {

	public static void main(String[] args) {
		
		CarType c = new CarType();
		c.start();
		
	}

}
