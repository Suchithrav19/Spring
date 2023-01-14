package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location locationn;
	
	@Autowired
	private Area area;
	
	public void a()
	{
		System.out.println("creating area object......");
		System.out.println(area.hashCode());
		
		System.out.println("creating location object........");
		System.out.println(locationn.hashCode());
		
	}
	
}

