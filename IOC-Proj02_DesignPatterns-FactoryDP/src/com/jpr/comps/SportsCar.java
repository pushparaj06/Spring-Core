package com.jpr.comps;

public class SportsCar implements ICar {

	@Override
	public void assemble() {
	System.out.println("SportsCar.assemble() : ferrari Assembled");	
	}

	@Override
	public void testDrive() {
		System.out.println("SportsCar.testDrive() : ferrari testdrived");
	}

	@Override
	public void delivered() {
		System.out.println("SportsCar.delivered() :ferrari delivered to customer");
	}

	@Override
	public void drive() {
		
		System.out.println("SportsCar.drive() :ferrari  driving by Customer ");
	}
	

}
