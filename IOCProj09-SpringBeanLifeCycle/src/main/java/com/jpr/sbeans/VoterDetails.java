package com.jpr.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vd")
public class VoterDetails {
	
	@Value("${voter.id}")
	private long vid;
	@Value("${voter.name}")
	private String vname;
	@Value("${voter.age}")
	private float age;
	private Date dov;
	
	public VoterDetails() {
		System.out.println("VoterDetails-0 Arg Constructor");
	}
	//custom init method or Life cycle method
	@PostConstruct
	public void preInit()
	{
		System.out.println("VoterDetails.preInit()");
		//Initialize left over properties
		dov=new Date();
		//Check given properties valid or not
		if(vname==null||age<0||age>120||vid<=0L)
		{
			throw new IllegalArgumentException("Invalid Inputs..");
		}
		
	}
	public String checkVotingElgibility()
	{
		if(age<18)
		{
			return "Mr/Ms:"+vname+" You Are Not Elgible for Voting. Verified on :"+dov;
		}
		else
		{
			return "Mr/Ms:"+vname+" You are  Eligible for Voting. VID: "+vid+" Verified on :"+dov;
		}
		
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("VoterDetails.destroy()");
		//nullifying the spring bean Properties
		dov=null;
		vid=0L;
		vname=null;
		age=0;
		
		
		
	}
	
	
	

}
