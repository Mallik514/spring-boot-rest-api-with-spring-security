package com.mallik.spring.boot.simplespringbootapplication.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.mallik.spring.boot.simplespringbootapplication"})
@EnableJpaRepositories(basePackages= {"com.mallik.spring.boot.simplespringbootapplication.repo"})
@EntityScan(basePackages= {"com.mallik.spring.boot.simplespringbootapplication.dto"})
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
		
		System.out.println("Application started on port 9191.");
	}

}
