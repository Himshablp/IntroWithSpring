package com.practise.IntroWithSpringCore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.config.xml");
		
		Emp emp = (Emp)context.getBean("empObj");
		System.out.println(emp);
	}

}
