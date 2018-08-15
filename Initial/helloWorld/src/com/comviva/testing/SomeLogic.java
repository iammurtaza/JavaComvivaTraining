package com.comviva.testing;

public class SomeLogic {
	public boolean sayHi() {
		return true;
	}

	public String sayHi(String name) {
		return "Hi " + name;
	}

	public String sayHello(String name) {
		//System.out.println("Saying hello " + name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello " + name;
	}
}
