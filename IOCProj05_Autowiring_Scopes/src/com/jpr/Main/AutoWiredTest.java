package com.jpr.Main;

import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;
import com.jpr.sbeans.WishMessageGenerator;

public class AutoWiredTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("AutoWiredTest :: IOC Container Creation Completed");
		
		WishMessageGenerator generator1 = ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg",WishMessageGenerator.class);
		//By Default Singleton scope here is takes from the Internal cache of the IOC container
		
		System.out.println("Generator1 :"+generator1.hashCode()+"------ Generator2 :"+generator2.hashCode());
		System.out.println("generator1==generator2"+(generator1==generator2));
		System.out.println("------------------------");
		
		LocalTime lt1 = ctx.getBean("ltime",LocalTime.class);
		LocalTime lt2 = ctx.getBean("ltime",LocalTime.class);
		
		System.out.println("LocalTime1 : "+lt1.hashCode()+"  LocalTime2 :"+lt2.hashCode());
		
		System.out.println("LocalTime1==LocalTime2 :"+(lt1==lt2));
		
		System.out.println("------------------------------------");
		
		System.out.println("All BeanId's Count is :"+ctx.getBeanDefinitionCount());
		System.out.println("All BEanId's Names :"+Arrays.toString(ctx.getBeanDefinitionNames()));
		
		//here we got that ioc container finds beans or Objects by bean id


	}

}
