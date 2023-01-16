package com.xworkz.dependencyInjection2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependencyInjection2.bean.Chrome;
import com.xworkz.dependencyInjection2.bean.FireBox;
import com.xworkz.dependencyInjection2.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {

		
		ApplicationContext container=new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Chrome chrome=container.getBean(Chrome.class);
		chrome.browser();
		
		FireBox fire=container.getBean(FireBox.class);
		fire.browser();
		
		
	}

}
