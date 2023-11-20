package com.InterfaceExample;

interface Sound{
	public abstract void makeSound();
}

interface Fly{
	public abstract void fly();
}

class Bird implements Sound, Fly{
	public void makeSound() {
		System.out.println("chirp, chirp...");
	}
	
	public void fly() {
		System.out.println("Birds flying high");
	}
	
}

public class InterfaceProgram {

	public static void main(String[] args) {
		Bird b = new Bird();
		b.makeSound();
		b.fly();
	}
}
