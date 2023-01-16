package com.xworkz.dependencyInjection2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.dependencyInjection2")
public class BrowserConfiguration {
	
	public BrowserConfiguration() {
		System.out.println("running BrowserConfiguration");
	}

}
