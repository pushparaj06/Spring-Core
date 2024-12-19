package com.jpr.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	//HAS-A Relation
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
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
