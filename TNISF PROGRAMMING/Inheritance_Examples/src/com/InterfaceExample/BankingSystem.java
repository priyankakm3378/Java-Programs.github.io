package com.InterfaceExample;

interface Account{
	void deposit(double amount);
	void withdraw(double amount);
	
	double getBalance();
}

class SavingsAccount implements Account{
	private double balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
public class BankingSystem {

	public static void main(String[] args) {
		SavingsAccount sv = new SavingsAccount();
		sv.deposit(1000);
		
		System.out.println("balance :"+sv.getBalance());
		
		sv.withdraw(500);
		System.out.println("Balance :"+sv.getBalance());
	}

}
