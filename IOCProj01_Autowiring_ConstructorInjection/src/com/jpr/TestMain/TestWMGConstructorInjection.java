package com.jpr.TestMain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.WishMessageGenerator;

public class TestWMGConstructorInjection {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		
		String result = generator.createMessage();
		String date = generator.createDate();
		
		System.out.println("result : "+result);
		System.out.println("Date is : "+date);
		
	}

}
