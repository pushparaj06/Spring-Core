package com.jpr.comps;

public class OffRoadingCar implements ICar {

	@Override
	public void assemble() {
		System.out.println("OffRoadingCar.assemble() : Thar Roxx Assembled");
	}

	@Override
	public void testDrive() {
		System.out.println("OffRoadingCar.testDrive() : Thar Roxx TestDrived");
	}

	@Override
	public void delivered() {
		System.out.println("OffRoadingCar.delivered() : Thar Roxx Delivered to Customer");
	}

	@Override
	public void drive() {
	System.out.println("OffRoadingCar.drive() : Tharr Roxx Driving by Customer");	
	}

}
