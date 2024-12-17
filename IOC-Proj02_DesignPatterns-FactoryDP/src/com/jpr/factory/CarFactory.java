package com.jpr.factory;

import com.jpr.comps.ICar;
import com.jpr.comps.LuxoryCar;
import com.jpr.comps.OffRoadingCar;
import com.jpr.comps.SportsCar;
import com.jpr.comps.StandardCar;

public class CarFactory {
	
	public static ICar getInstance(String carType)
	{
		ICar car = null;
		
		if(carType.equalsIgnoreCase("luxory"))
			car = new LuxoryCar();
		
		else if(carType.equalsIgnoreCase("sports"))
			car = new SportsCar();
		
		else if(carType.equalsIgnoreCase("offRoading"))
			car = new OffRoadingCar();
		else if(carType.equalsIgnoreCase("standard"))
			car = new StandardCar();
		else
			throw new IllegalArgumentException("Invalid Car Type");
		car.assemble();
		car.testDrive();
		car.delivered();
		
		return car;
	}

}
