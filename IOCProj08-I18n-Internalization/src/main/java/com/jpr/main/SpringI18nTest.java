package com.jpr.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.Config.AppConfig;

public class SpringI18nTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Gether Locale Details from End User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Language Code:");
		String lang=sc.next();
		System.out.println("Enter Country Code:");
		String country=sc.next();
		//prepare Locale object Data
		Locale locale = new Locale(lang,country);
		//get the message from the from the Locale Specific properties file
		
		String Message1 = ctx.getMessage("nit.welcome",new String[]{"Rishi"}, "Not Matched", locale); 
		String Message2 = ctx.getMessage("nit.bye",new String[]{}, "Not Matched", locale); 
		String Message3 = ctx.getMessage("nit.wishesh",new String[]{}, "Not Matched", locale); 
		
		System.out.println(Message1 +"....."+Message2+"....."+Message3);
		
		ctx.close();
	}

}
