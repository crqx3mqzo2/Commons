package com.saajf.apt.spring.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.saajf.apt.spring.utils"})
public class libraryUtiltaries {

	public static void main(String[] args) {
		SpringApplication.run(libraryUtiltaries.class, args);
	}
}
