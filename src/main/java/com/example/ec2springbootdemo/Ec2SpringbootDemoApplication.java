package com.example.ec2springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ec2SpringbootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Ec2SpringbootDemoApplication started");
		SpringApplication.run(Ec2SpringbootDemoApplication.class, args);
		
	}
	@GetMapping("/api/msg/{name}")
	public String getMessage(@PathVariable String name){
		return name +" Welcome in the EC2 Instance world";
	}
}


