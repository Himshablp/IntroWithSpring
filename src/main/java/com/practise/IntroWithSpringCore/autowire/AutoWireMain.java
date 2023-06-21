package com.practise.IntroWithSpringCore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.config.xml");
		
		Emp emp = (Emp)context.getBean("empObj");
		System.out.println(emp);
	}

}
