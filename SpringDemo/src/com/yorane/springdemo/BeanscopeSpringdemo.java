package com.yorane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanscopeSpringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSameApplicationConext();
		testDiffApplicationConext();
		
	}
	static void ENTER() { System.out.println("\n-----------------------------------\n");
	}
	static void END() { System.out.println("\n-----------------------------------\n");
	}
	public static void testSameApplicationConext()
	{
		ENTER();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		Coach theCoach = context.getBean("Mycoach",Coach.class);
		
		//System.out.println(theCoach.getdailyworkout() + " --" + theCoach.getdailyFortune()); 
		Coach anotherCoach = context.getBean("Mycoach",Coach.class);
		System.out.println(theCoach + " : " + anotherCoach);
		String op = (theCoach == anotherCoach) ? " = " : " != ";
		System.out.println(theCoach +  op  + anotherCoach);
		context.close();
		//assert(theCoach.hashCode() == anotherCoach.hashCode());
		END();
	}
	
	public static void testDiffApplicationConext()
	{
		ENTER();
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		Coach theCoach = context1.getBean("Mycoach",Coach.class);
		
		//System.out.println(theCoach.getdailyworkout() + " --" + theCoach.getdailyFortune()); 
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		Coach anotherCoach = context2.getBean("Mycoach",Coach.class);
		System.out.println(theCoach + " : " + anotherCoach);
		String op = (theCoach == anotherCoach) ? " = " : " != ";
		System.out.println(theCoach +  op  + anotherCoach);
		context1.close();
		context2.close();
		//assert(theCoach.hashCode() != anotherCoach.hashCode());
	     END();
	}

}
