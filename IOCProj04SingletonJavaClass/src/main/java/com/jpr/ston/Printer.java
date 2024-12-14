package com.jpr.ston;

public class Printer {
	
	private static Printer INSTANCE; //Referece Variable to hold the single object
	
	//Private Constructor 
	private Printer()
	{
		System.out.println("Printer.printer()-0 Arg Constructor");
	}
	
	//Static factory method having singleton logic
	
	public static  Printer getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new Printer();
		}
		return INSTANCE;
		
	}
	
	//BUSINESS LOGIC
	public void print(String data)
	{
		System.out.println(data);
	}
	
	
	

}
