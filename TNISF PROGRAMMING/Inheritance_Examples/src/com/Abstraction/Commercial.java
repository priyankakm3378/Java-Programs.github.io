package com.Abstraction;

public class Commercial extends ElectricityBill{

	public float computeBill(){
		return 1.25f * 100;
	}
	
	public static void main(String[] args) {
		Commercial c = new Commercial();
		System.out.println(c.computeBill());
		
		
		Domestic d = new Domestic();
		System.out.println(d.computeBill());
		
	}
}

