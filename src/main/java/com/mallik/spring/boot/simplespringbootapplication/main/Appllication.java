package com.mallik.spring.boot.simplespringbootapplication.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.mallik.spring.boot.simplespringbootapplication"})
public class Appllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Appllication.class, args);
		
		System.out.println("Application started on port 8080.");
	}

}
