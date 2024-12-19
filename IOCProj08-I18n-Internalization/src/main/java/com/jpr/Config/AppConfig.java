package com.jpr.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource")  //fixed Bean ID
	public ResourceBundleMessageSource createRBMS()
	{
		ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
		rbms.setBasename("com/jpr/commons/App");
		return rbms;
	}

}
