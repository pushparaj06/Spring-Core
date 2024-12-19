package com.jpr.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dhcl")
@Primary
public final class  DHCL implements Courier {

	@Override
	public String deliver(int oid) {
		
		return oid+ " kept Order Items are Delivery Assigned to DHCL";
	}

}
