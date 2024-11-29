package com.jpr.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.WishMessageGenerator;

public class AutoWiredTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get Target Spring bean class Object ref
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String time = generator.generateMessage();
		String day = generator.createDate();
		
		System.out.println("Result: "+time);
		System.out.println("Result: "+day);
		
		ctx.close();

	}

}
