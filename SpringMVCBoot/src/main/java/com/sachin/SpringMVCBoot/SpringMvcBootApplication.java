package com.sachin.SpringMVCBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringMvcBootApplication.class, args);

		/*Alion a = ctx.getBean(Alion.class);
		a.m1();*/
	}

}
