package com.luv2code.springdemo;

public class SadFortuneSrvice implements FortuneService {

	@Override
	public String getFortune() {
	
		return "Today is a sad day";
	}

}
