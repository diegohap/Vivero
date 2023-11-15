package com.vivero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:/home/diegohap/.secrets/secretpr1.properties")
public class ViveroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViveroApplication.class, args);
	}

}
