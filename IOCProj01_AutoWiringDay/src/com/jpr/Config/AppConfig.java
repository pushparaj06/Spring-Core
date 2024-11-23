package com.jpr.Config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.jpr.sbeans")
public class AppConfig {
	
	@Bean(name ="localdt")
	public LocalDateTime creationofdate()
	{
		
		return LocalDateTime.now();
	}
	

}
