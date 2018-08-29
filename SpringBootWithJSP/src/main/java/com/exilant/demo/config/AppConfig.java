package com.exilant.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Import({com.exilant.demo.config.RepositoryConfig.class,com.exilant.demo.util.HibernateUtilConfig.class})
@Configuration
public class AppConfig {
	@Bean
	public ViewResolver getViewResolver() {
		System.out.println("======VIEW RESOLVER======");
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("WEB-INF/jsp/");
	resolver.setSuffix(".jsp");
	resolver.setViewClass(JstlView.class);
	return resolver;
	}
	
}
