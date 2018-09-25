package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
		
		
		
		IHello ihello = (IHello)context.getBean("helloService");
		System.out.println(ihello.sayHello("sharpfire"));
	}

}
