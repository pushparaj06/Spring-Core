package com.jpr.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.config.AppConfig;
import com.jpr.sbeans.VoterDetails;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		VoterDetails details = ctx.getBean("vd",VoterDetails.class);
		//invoke the b.Method
		String Message = details.checkVotingElgibility();
		System.out.println(Message);
		
		ctx.close();

	}

}
