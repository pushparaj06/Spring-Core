package com.jpr.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Bdart")

public final class BlueDart implements Courier {
	
	

	public BlueDart() {
	System.out.println("BlueDart:0-arg Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+ " kept Order Items are Delivery Assigned to Blue Dart";
	}

}
