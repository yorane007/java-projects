package com.yorane.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class GreetFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "All the best";
	}
	@PostConstruct
	void init() {
		System.out.println("Inside GreetFortuneService init...");
	}

}
