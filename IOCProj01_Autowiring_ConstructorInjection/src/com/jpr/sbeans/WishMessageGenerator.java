package com.jpr.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")

public class WishMessageGenerator {

private LocalTime lt;
private LocalTime ld;


@Autowired(required=false)
    public WishMessageGenerator(LocalTime lt) {
	super();
	this.lt = lt;
}


	@Autowired(required=false)
	public WishMessageGenerator(LocalTime lt, LocalTime ld) {
	super();
	this.lt = lt;
	this.ld = ld;
}


	public String createMessage()
	{
		int hour = lt.getHour();
		
		if(hour>0 && hour<12)
		{
			return "Good Morning";
		}
		else if(hour>11 && hour <4)
		{
			return "Good Afternoon";
		}
		else if(hour>3 && hour<8)
		{
			return "Good Evening";
		}
		else
		{
			return "Good Night";
		}
	}
	
	public String createDate()
	{
		return ld.toString();
	}
	


}
