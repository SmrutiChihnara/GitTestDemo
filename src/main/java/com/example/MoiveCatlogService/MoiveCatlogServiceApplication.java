package com.example.MoiveCatlogService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.MoiveCatlogService")
public class
MoiveCatlogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoiveCatlogServiceApplication.class, args);
	}

}
