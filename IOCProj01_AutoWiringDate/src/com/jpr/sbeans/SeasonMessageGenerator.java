//SeasonMessageGenerator(target class)
package com.jpr.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("smg") //to make Java class as Spring bean 
public class SeasonMessageGenerator {
	
	@Autowired
	private LocalDate ld;
	
	public String generateSeason()
	{
		int month = ld.getMonthValue();
		
		if(month>5 && month <11)
		{
			return "May be Rainy Day!";
		}
		else if(month>10 && month <13 || month>0 && month<3)
		{
			return "too Cold its Winter";
		}
		else return "Summer Day";
	
		
		
	}
	
	

}
