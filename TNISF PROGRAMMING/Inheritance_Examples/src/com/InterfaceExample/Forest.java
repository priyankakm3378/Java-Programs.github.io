package com.InterfaceExample;

interface Animal{
	void makeSound();
}

interface Lion extends Animal{
	void giveBirth();
}

class BabyLion implements Lion{
	
	public void makeSound() {
		System.out.println("Lion roars");
	}
	
	public void giveBirth() {
		System.out.println("Lion gave birth to 10 cubs");
	}
}
public class Forest {

	public static void main(String[] args) {
		BabyLion bl = new BabyLion();
		bl.makeSound();
		bl.giveBirth();
		
	}
}
