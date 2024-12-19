//WishMessageGenerator Class (Target Class)
package com.jpr.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	private LocalTime lt;
	private LocalDate ld;

	@Autowired
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}
	
    @Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}


	public String generateMessage()
	{
		return "Time is :"+lt.toString();
	}
	
	public String createDate()
	{
		return "Date is :"+ld.toString();
	}
	
	
	
	


}
