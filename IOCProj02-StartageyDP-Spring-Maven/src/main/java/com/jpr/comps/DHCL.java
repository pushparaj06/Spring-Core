package com.jpr.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dhcl")
@Lazy(true)
@Primary
public final class  DHCL implements Courier {
	

	public DHCL() {
		System.out.println("DHCL:0-arg Constructor ");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+ " kept Order Items are Delivery Assigned to DHCL";
	}

}
