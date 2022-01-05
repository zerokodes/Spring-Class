package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice sprint double hooping for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
