package com.jpr.Config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.jpr.sbeans")
public class AppConfig {
	
	@Bean(name="lDate")
	public LocalDate ldate()
	{
		return LocalDate.now();
	}
	

}
