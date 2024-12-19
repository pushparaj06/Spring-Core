package com.jpr.Config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jpr.sbeans")
public class AppConfig {
	
	@Bean(name = "localt")
	public LocalTime creaeLT()
	{
		return LocalTime.now();
	}
	@Bean(name = "locald")
	public LocalDate creaeLD()
	{
		return LocalDate.now();
	}

}
