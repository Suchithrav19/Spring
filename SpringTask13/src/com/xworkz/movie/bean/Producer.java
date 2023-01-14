
package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistant assistant;
	@Autowired
	private Company company;
	
	public void p()
	{
		System.out.println("creating assistance object");
		System.out.println(assistant.hashCode());
		System.out.println("creating company object");
		System.out.println(company.hashCode());
		
	}
	
	

}
