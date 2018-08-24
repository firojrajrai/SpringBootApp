package com.exilant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.exilant.demo.command.Employee;

@SpringBootApplication
/*@Configuration
@EnableAutoConfiguration
@ComponentScan({"com"})*/
public class SpringBootWithJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJspApplication.class, args);
	}
	
	@Bean
	public ViewResolver getViewResolver() {
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("WEB-INF/jsp/");
	resolver.setSuffix(".jsp");
	resolver.setViewClass(JstlView.class);
	return resolver;
	}

	
}
