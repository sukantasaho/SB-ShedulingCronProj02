package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbShedulingCronProj02Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SbShedulingCronProj02Application.class, args);
	}

}
