package com.jpr.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.WishMessageGenerator;

public class AutoWiredTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get Target Spring bean class Object ref
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String Message = generator.generateMessage("Raj");
		
		System.out.println("Result:"+Message);
		
		ctx.close();

	}

}
