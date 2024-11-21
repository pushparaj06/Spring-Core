package com.jpr.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder{
	
	@Autowired
	private LocalDateTime ldt;
	
	
	public String createWeekDayEnd()
	{
		
		DayOfWeek day = ldt.getDayOfWeek();
		
		if(day.getValue()>0 && day.getValue()<6)
		{
			return "WeekDay Keep Working Hard!";
		}
		
		
		return "WeekEnd Enjoy The Day and sleep...";
		
	}
	
	
	
	
	
	

}
