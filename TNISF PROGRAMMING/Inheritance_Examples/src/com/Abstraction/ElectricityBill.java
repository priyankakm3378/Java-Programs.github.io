package com.Abstraction;

public abstract class ElectricityBill {
public abstract float computeBill();
	
}

class Domestic extends ElectricityBill {

	@Override
	public float computeBill() {
		
		return 0.25f*75;
	}
	
}