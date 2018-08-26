package com.comviva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceClient {
	public static void main(String[] args) {
		// XmlBeanFactory beanFactory = new XmlBeanFactory(new
		// ClassPathResource(
		// "context.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"context.xml");
		IService service = (IService) context.getBean("hello");

		System.out.println(service.sayHello());
	}
}
