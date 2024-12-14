package com.jpr.Main;

import com.jpr.Factory.FlipkartFactory;
import com.jpr.comps.Flipkart;

public class FlipkarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get Flipkart class Object
		Flipkart fpkrt = FlipkartFactory.getInstance("BDart");
		
		//Invoke the Business Method
		
		String resultMsg = fpkrt.shopping(new String[]{"Watch","Washing Machine","Iphone"},
										 new double[] {5000.0,12000,24000});
		
		
	 System.out.println(resultMsg);
	}

}
