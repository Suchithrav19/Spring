package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	@Autowired
	private Capacity capacity;
	
	public void batt()
	{
		System.out.println("created capacity object");
		System.out.println(capacity.hashCode());
	}

}

