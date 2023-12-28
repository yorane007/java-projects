package com.yorane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringAnnotationNoXMLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach c = context.getBean("tennisCoach",Coach.class) ;
	    System.out.println(c.getDailyWorkout());
	    System.out.println(c.getDailyFortune());
	    context.close();
	    		
	}

}
