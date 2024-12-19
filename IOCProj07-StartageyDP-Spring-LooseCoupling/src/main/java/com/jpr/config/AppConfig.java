package com.jpr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.jpr.comps")
//@PropertySource("com/jpr/commons/CourierFile.properties")
@ImportResource("com/jpr/cfgs/applicationContext.xml")
public class AppConfig {

}
