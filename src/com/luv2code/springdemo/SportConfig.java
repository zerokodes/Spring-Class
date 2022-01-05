package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneSrvice();
	}
	
	//define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	// define bean for great fortune service
	@Bean
	public FortuneService greatFortuneService() {
		return new GreatFortuneService();
	}
	
	//define bean for golf coach and inject dependency
	@Bean
	public Coach golfCoach() {
		return new GolfCoach(greatFortuneService());
	}
}

