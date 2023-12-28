package com.yorane.springdemo;

public class TrackCoach implements Coach {

	FortuneService fs;
	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "Sprint on track";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "From Track coach "+ fs.getDailyFortune();
	}

	public TrackCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}
	

}
