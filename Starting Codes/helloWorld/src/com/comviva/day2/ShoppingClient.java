package com.comviva.day2;

public class ShoppingClient {
	public static void main(String[] args) {
//		ShoppingLogic a1 = new ShoppingLogic("Dilbar", 6);
//		ShoppingLogic a2 = new ShoppingLogic("Billu", 4);
//		ShoppingLogic a3 = new ShoppingLogic("Santa", 7);
		
		System.out.println("This is start of "+ Thread.currentThread());
		
		Thread t1 = new Thread(new ShoppingLogic(), "abc");
		t1.setPriority(6);
		t1.start();
		
		Thread t2 = new Thread(new ShoppingLogic(), "mno");
		t2.setPriority(7);
		t2.start();
		//System.exit(0);
		Thread t3 = new Thread(new ShoppingLogic(), "xyz");
		t3.setPriority(8);
		t3.start();
		
		for(int i=0;i<500;i++){
			System.out.println("I value " + i + ", in thread " +
					Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
		}
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + Thread.currentThread() + " exiting");
	}
}
