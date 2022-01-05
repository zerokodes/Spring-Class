package com.luv2code.springdemo;

public class GreatFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a great day.";
	}

}
