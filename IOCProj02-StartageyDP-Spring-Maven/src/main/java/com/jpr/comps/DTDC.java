package com.jpr.comps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dtdc")

public final class  DTDC implements Courier {

	public DTDC() {
	System.out.println("DTDC:0-arg constructor ");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+ " kept Order Items are Delivery Assigned to DTDC";
	}

}
