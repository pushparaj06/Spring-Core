package com.jpr.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpr.comps.Flipkart;
import com.jpr.config.AppConfig;


public class FlipkarClient {

	

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//get Flipkart class Object
		Flipkart fpkrt = ctx.getBean("fpkt",Flipkart.class);
		
		//Invoke the Business Method
		
		String resultMsg = fpkrt.shopping(new String[]{"Watch","Washing Machine","Iphone"},
										 new double[] {5000.0,12000,24000});
		
		
	 System.out.println(resultMsg);  
}

}
