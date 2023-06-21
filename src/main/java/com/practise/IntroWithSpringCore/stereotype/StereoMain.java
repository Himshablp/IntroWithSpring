package com.practise.IntroWithSpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
		

	}

}
