package com.xworkz.dependencyInjection2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser{
	
	@Autowired
	@Qualifier("airtel")
	private Airtel airtel;
	
	@Override
	public void browser() {
		System.out.println("running firebox");
		
		airtel.connect();
	}

}
