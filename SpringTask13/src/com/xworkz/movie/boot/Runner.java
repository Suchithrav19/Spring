package com.xworkz.movie.boot;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.movie.bean.Battery;
import com.xworkz.movie.bean.Camera;
import com.xworkz.movie.bean.CameraMan;
import com.xworkz.movie.bean.Company;
import com.xworkz.movie.bean.Director;
import com.xworkz.movie.bean.Movie;
import com.xworkz.movie.bean.Producer;
import com.xworkz.movie.configuration.ConfigurationBean;


public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext app=new AnnotationConfigApplicationContext(ConfigurationBean.class);
        System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
        
        System.out.println("************************");
        Battery battery=app.getBean(Battery.class);
        battery.batt();
        
        System.out.println("********************");
        Camera camera=app.getBean(Camera.class);
        camera.cam();
        
        System.out.println("**********************");
        CameraMan cm=app.getBean(CameraMan.class);
        cm.man();
        
        System.out.println("*********************");
        Director r=app.getBean(Director.class);
        r.mc();
        
        System.out.println("*********************");
        Movie mov=app.getBean(Movie.class);
        mov.n();
        
	    System.out.println("********************");
        Company com=app.getBean(Company.class);
        com.a();
        
        System.out.println("***************************");
        Producer pro=app.getBean(Producer.class);
        pro.p();
        }

}
