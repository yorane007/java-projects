package com.yorane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach theCoach = context.getBean("Mycoach",Coach.class);
		System.out.println(theCoach.getdailyworkout() + " --" + theCoach.getdailyFortune()); 
		
		CricketCoach crickCoach = context.getBean("MyCricketCoach",CricketCoach.class);
		System.out.println(crickCoach.getdailyworkout() + " --" + crickCoach.getdailyFortune()); 
		System.out.println(crickCoach.getEmail() + " : " + crickCoach.getTeam());
		
		
		context.close();
		
		
	}

}
