package com.jpr.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	
	//HAS-A Relation
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	//b.method 
	
	public String shopping(String items[],double prices[])
	{
		double totalAmt=0.0;
		for(double p :prices)
		{
			totalAmt = totalAmt+p;
		}
		//generating Random order id
		int oid = new Random().nextInt(30000);
		
		//use Dependent class
		String dMsg = courier.deliver(oid);
		
		return Arrays.toString(items)+" Purchased with Prices of:"+Arrays.toString(prices)+" Total Bill:"+totalAmt+".Order ID:."+dMsg;
	}
	
	

}
