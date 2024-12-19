package com.jpr.comps;

public class StandardCar implements ICar {

	@Override
	public void assemble() {
		
		System.out.println("StandardCar.assemble() :Maruthi Suzuki Swift Assembled ");
		
	}

	@Override
	public void testDrive() {
	
		System.out.println("StandardCar.testDrive() :Maruthu Suzuki Swift testDrived");
	}

	@Override
	public void delivered() {
		
		System.out.println("StandardCar.delivered() : Maruthi Suzuki Swift  Delivered to Customer ");
	}

	@Override
	public void drive() {
		System.out.println("StandardCar.drive() :  Maruthi Suzuki Swift driving by customer ");
		
	}
	
	

}
