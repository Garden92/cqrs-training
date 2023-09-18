package com.ktds.cqrsbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAsync
@SpringBootApplication
public class CqrsBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(CqrsBasicApplication.class, args);
	}

}
