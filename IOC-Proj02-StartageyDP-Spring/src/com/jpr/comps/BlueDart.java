package com.jpr.comps;

import org.springframework.stereotype.Component;

//@Component("Bdart")
@Component("courier")
public final class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		
		return oid+ " kept Order Items are Delivery Assigned to Blue Dart";
	}

}