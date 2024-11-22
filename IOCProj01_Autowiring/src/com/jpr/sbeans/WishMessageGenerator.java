//WishMessageGenerator Class (Target Class)
package com.jpr.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalTime lt;
	
	public String generateMessage(String user)
	{
		
		int hour = lt.getHour();
		
		if(hour<12)
		{
			return "Good Morning "+user;
		}
		else if(hour<16)
		{
			return "Good Afternoon "+user;
		}
		else if(hour<20)
		{
			return "Good Evening "+user;
		}
		else
		{
			return "Good Night "+user;
		}

		
	}
	
	
	


}
