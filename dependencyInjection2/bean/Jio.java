package com.xworkz.dependencyInjection2.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("running Jio");
	}

}