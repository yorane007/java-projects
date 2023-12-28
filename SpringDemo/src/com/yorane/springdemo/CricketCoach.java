package com.yorane.springdemo;

public class CricketCoach implements Coach {

	FortuneService fs; 
	String email;
	String team;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 30 mins";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return fs.getDailyFortune();
	}

	public FortuneService getFortuneService() {
		return fs;
	}

	public void setFortuneService(FortuneService fs) {
		this.fs = fs;
	}

}
