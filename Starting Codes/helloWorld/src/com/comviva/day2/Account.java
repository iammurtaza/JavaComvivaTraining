package com.comviva.day2;

public class Account {
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount){
		if(amount<balance){
			try{
				Thread.sleep(1000);
				
				balance = balance - amount;
				System.out.println("Withdrawn: " + amount + " Balace: " + balance);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		else{
			System.out.println("Sorry " + Thread.currentThread().getName() + ", No balance");
		}
	}
}
