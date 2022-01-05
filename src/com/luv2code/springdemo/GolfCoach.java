package com.luv2code.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Do 50 long stokes every day";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
