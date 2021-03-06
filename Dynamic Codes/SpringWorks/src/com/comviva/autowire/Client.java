package com.comviva.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"context_comp.xml", "context_key.xml", "context_moni.xml", "context_pro.xml");

		Computer computer = context.getBean("computer", Computer.class);
		
		System.out.println(computer.getMonitor());
		System.out.println(computer.getKeyboard());
		System.out.println(computer.getProcessor());
	}
}
