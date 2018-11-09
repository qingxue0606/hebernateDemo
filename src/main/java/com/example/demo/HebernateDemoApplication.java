package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class HebernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HebernateDemoApplication.class, args);
	}

}
