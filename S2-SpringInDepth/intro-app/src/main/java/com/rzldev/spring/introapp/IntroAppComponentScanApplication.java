package com.rzldev.spring.introapp;

import com.rzldev.spring.componentscan.ComponentDAO;
import com.rzldev.spring.introapp.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.rzldev.spring.componentscan")
public class IntroAppComponentScanApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(IntroAppComponentScanApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(IntroAppComponentScanApplication.class)) {

			ComponentDAO componentDAO = appContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDAO);
			LOGGER.info("{}", componentDAO.getJdbcConnection());
		}
	}
}
