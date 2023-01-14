package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;
	
	public void cam()
	{
		System.out.println("creating object of lens......");
		System.out.println(lens.hashCode());
		
		System.out.println("creating object of battery........");
		System.out.println(battery.hashCode());
	}
	
	

}

