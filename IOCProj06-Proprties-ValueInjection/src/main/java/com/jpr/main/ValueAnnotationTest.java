package com.jpr.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.PersonInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonInfo info = ctx.getBean("pInfo",PersonInfo.class);
		
		System.out.println(info);
		ctx.close();

	}

}
