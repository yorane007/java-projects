package com.yorane.springdemo;
import org.springframework.context.annotation.*;
@Configuration
@ComponentScan("com.yorane.spring.demo")
public class SportConfig {
	@Bean
	public FortuneService greetFortune() {
		return new GreetFortuneService();
	}
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(greetFortune());
	}

}
