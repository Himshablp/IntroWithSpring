package com.practise.IntroWithSpringCore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
       Student student1 = (Student)context.getBean("student1");
       
       System.out.println("_____________________________________________________________________________________________________");
       System.out.println(student1);
       context.registerShutdownHook();
       
       System.out.println("________________________________________________________________________________________________");
       
       Pepsi pepsi = (Pepsi)context.getBean("pepsiObj");
       System.out.println(pepsi);
       
       System.out.println("_______________________________________________________________________________________________________");
       
       College college = (College)context.getBean("collegeObj");
       System.out.println(college);
       
    }
}
