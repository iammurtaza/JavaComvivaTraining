package com.comviva.day2;

class Rules {}

public class ShoppingLogic extends Rules implements Runnable{
	private String name;
	private int priority;
	private Thread thread;
	
	public ShoppingLogic() {
	}
	
	public ShoppingLogic(String name, int priority) {
		this.name = name;
		this.priority = priority;
		thread = new Thread(this);
		thread.setPriority(priority);
		thread.start();
	}

	@Override
	public void run() {
		for(int i=0;i<500;i++){
			System.out.println("I value " + i + ", in thread " +
					Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
		}
		System.out.println("Thread " + Thread.currentThread() + " exiting");
	}
}
