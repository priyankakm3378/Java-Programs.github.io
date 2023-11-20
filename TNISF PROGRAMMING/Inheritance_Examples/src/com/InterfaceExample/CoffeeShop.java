package com.InterfaceExample;

interface CoffeeMachine {
	void brewCoffee();
}

class BasicMachine implements CoffeeMachine {
	public void brewCoffee() {
		System.out.println("Basic brown coffee");
	}
}

class PremiumCoffee implements CoffeeMachine {

	public void brewCoffee() {
		System.out.println("Premium brown coffee");
	}
}

public class CoffeeShop {
	public static void main(String[] args) {
		BasicMachine machine = new BasicMachine();
		PremiumCoffee pm = new PremiumCoffee();

		machine.brewCoffee();
		pm.brewCoffee();

	}

}
