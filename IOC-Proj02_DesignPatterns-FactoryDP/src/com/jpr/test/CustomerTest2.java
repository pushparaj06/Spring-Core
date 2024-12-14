package com.jpr.test;

import com.jpr.comps.ICar;
import com.jpr.factory.CarFactory;

public class CustomerTest2 {
	public static void main(String[] args) {
		ICar car = CarFactory.getInstance("luxory");
		car.drive();
	}

}
