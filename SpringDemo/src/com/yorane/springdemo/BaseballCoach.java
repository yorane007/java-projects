package com.yorane.springdemo;

public class BaseballCoach implements Coach {
	
	FortuneService fs;
	@Override
	public String getdailyworkout(){
		return "spend 30 mins on bike";
	}
	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "From Basketball coach "+ fs.getDailyFortune();
	}

	public BaseballCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}
	void Initialize() {
		System.out.println("I am " + this);
	}
	void Destruct() {
		//System.out.println("I am " + this);
	}


}
