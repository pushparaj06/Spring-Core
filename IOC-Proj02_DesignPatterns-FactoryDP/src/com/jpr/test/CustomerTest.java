package com.jpr.test;

import com.jpr.comps.ICar;
import com.jpr.factory.CarFactory;

public class CustomerTest {
	public static void main(String[] args) {
		
		ICar car = CarFactory.getInstance("standard");
		car.drive();
		
	}

}
