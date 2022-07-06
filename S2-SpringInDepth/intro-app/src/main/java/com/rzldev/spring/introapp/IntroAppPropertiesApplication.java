package com.rzldev.spring.introapp;

import com.rzldev.spring.introapp.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class IntroAppPropertiesApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(IntroAppPropertiesApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(IntroAppPropertiesApplication.class)) {

			SomeExternalService service = appContext.getBean(SomeExternalService.class);

			LOGGER.info("{}", service);
			LOGGER.info("{}", service.getUrl());
		}
	}
}
