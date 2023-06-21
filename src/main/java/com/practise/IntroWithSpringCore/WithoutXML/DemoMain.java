package com.practise.IntroWithSpringCore.WithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Student student = (Student)context.getBean("student");
		student.study();
		
	}

}
