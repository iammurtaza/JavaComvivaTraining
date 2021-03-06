package com.comviva.day2;

public class ThreadClient01 {
	public static void main(String[] args) {
		System.out.println("The main thread name is: " + Thread.currentThread().getName());
	
		BusinessLogic b1 = new BusinessLogic();
		BusinessLogic b2 = new BusinessLogic();
		//b1.run();
		b1.setName("Laptop");
		b2.setName("Monitor");
		//NORM = 5(default), MAX =10, MIN =1
		b1.setPriority(Thread.NORM_PRIORITY);
		b2.setPriority(b1.getPriority()+1);
		
		b1.start();
		b2.start();
		for(int i=0;i<500;i++){
			System.out.println("I value " + i + ", in thread " +
					Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
