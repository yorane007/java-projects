package com.yorane.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice batting"; 
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "No msg";
	}

}
