package com.javaEncapsulation;

public class Account {
	private String name;
	private long Acc_num;
	private String email;
	private float amount;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getAcc_num() {
		return Acc_num;
	}
	
	public void setAcc_num(long Acc_num) {
		this.Acc_num = Acc_num;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.setAcc_num(98745632110123L);
		ac.setName("Priyanka");
		ac.setEmail("priya@gmail.com");
		ac.setAmount(500000f);
		
		System.out.println(ac.getAcc_num()+"\n"+ac.getName()
		+"\n"+ac.getEmail()+"\n"+ac.getAmount());
		
	}
}
