package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.WeekDayFinder;

public class TestWeekDayFinder {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WeekDayFinder finder = ctx.getBean("wdf", WeekDayFinder.class);
		
		String result = finder.createWeekDayEnd();
		
		System.out.println("The Day is "+result);

	}

}
