package com.comviva.day2;

public class BusinessLogic extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
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
		System.out.println("Thread " + Thread.currentThread().getName()+ " exiting");
	}

}
