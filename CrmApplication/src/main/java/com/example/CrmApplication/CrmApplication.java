  package com.example.CrmApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class CrmApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(CrmApplication.class, args);
	}

}
