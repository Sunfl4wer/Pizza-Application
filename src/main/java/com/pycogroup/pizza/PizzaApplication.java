package com.pycogroup.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pycogroup.pizza.common.ActionAspect;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
	}

	@Bean
	public ActionAspect actionAspect() {
	  return new ActionAspect();
	}

}
