package com.comviva.day2;

public class AccountClient implements Runnable{
	Account account;
	String name;
	int amount;
	public AccountClient(Account account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
		new Thread(this, name).start();
	}
	
	public void run(){
		account.withdraw(amount);
	}
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		new AccountClient(account, "Naveen", 500);
		new AccountClient(account, "Vishal", 750);
	}
}
