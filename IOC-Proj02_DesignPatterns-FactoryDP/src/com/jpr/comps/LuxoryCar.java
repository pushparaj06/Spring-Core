package com.jpr.comps;

public class LuxoryCar implements ICar {

	@Override
	public void assemble() {
		
		System.out.println("LuxoryCar.assemble() : Rolls Royls Assembled");
	}

	@Override
	public void testDrive() {
		System.out.println("LuxoryCar.testDrive() : Rolls Royls test Drived");
	}

	@Override
	public void delivered() {
	System.out.println("LuxoryCar.delivered() : Rolls Royls  Delivered to Customer");	
	}

	@Override
	public void drive() {
		
		System.out.println("LuxoryCar.drive() : Rolls Royls Driving By Customer");
		
	}

}
