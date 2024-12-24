package com.jpr.Config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jpr.sbeans")
public class AppConfig {
	
	@Bean(name ="ltime")
	public LocalTime createLtime()
	{
		return LocalTime.now();
	}
	
	

}
