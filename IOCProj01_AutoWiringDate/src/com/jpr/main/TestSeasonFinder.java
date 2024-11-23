package com.jpr.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.SeasonMessageGenerator;

public class TestSeasonFinder {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasonMessageGenerator generate = ctx.getBean("smg",SeasonMessageGenerator.class);
		
		String result = generate.generateSeason();
		
		System.out.println("Result is:"+result);
		
	}

}
