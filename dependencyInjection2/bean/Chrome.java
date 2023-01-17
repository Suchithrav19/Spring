package com.xworkz.dependencyInjection2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	@Override
	public void browser() {
		System.out.println("running chrome");
		
		provider.connect();
	}
	

}
