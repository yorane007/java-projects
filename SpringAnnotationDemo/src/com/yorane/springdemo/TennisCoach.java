package com.yorane.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
 
	//@Autowired
	//@Qualifier("greetFortuneService")
	FortuneService s;
				
	@Autowired
	public TennisCoach( @Qualifier("greetFortuneService") FortuneService f){
		s=f;
		System.out.println("In constrctor");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backhand valley"; 
	}
	public String getDailyFortune() {
		return s.getDailyFortune();
		
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method called");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Cleanup method called");
		
	}
	

}
