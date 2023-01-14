package com.xworkz.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Experience experience;
	@Autowired
	private Skill skill;
	
	public void mc()
	{
		System.out.println("created experience object....");
		System.out.println(experience.hashCode());
		
		System.out.println("created skill object.....");
		System.out.println(skill.hashCode());
	}
	

}

