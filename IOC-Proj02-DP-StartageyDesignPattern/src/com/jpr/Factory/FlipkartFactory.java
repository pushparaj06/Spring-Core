package com.jpr.Factory;

import com.jpr.comps.BlueDart;
import com.jpr.comps.Courier;
import com.jpr.comps.DTDC;
import com.jpr.comps.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getInstance(String courierType)
	{
		//create Dependent class Object
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("dtdc"))
		{

			courier = new DTDC();
		}
		else if(courierType.equalsIgnoreCase("BDart"))
		{
			courier = new BlueDart();
		}
		
		else 
		  throw new IllegalArgumentException("Invalid Courier Type");
		
		//create target class Object
		Flipkart fpkrt = new Flipkart();
		
		//Assign Dependent class Objects to target class Obj
		fpkrt.setCourier(courier);
		
		return fpkrt;
		
		
	}

}
