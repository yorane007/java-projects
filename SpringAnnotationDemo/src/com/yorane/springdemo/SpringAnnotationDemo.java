package com.yorane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		Coach c = context.getBean("tennisCoach",Coach.class) ;
	    System.out.println(c.getDailyWorkout());
	    System.out.println(c.getDailyFortune());
	    context.close();
	    		
	}

}
