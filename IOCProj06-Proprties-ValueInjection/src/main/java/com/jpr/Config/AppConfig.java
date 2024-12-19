package com.jpr.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.jpr.sbeans")
@PropertySource("com/jpr/commons/Info.properties")
public class AppConfig {

}
