package com.rzldev.spring.introapp;

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
@ComponentScan
public class IntroAppScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(IntroAppScopeApplication.class);

	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(IntroAppScopeApplication.class, args);

		try (AnnotationConfigApplicationContext appContext =
				new AnnotationConfigApplicationContext(IntroAppScopeApplication.class)) {

			PersonDAO personDao = appContext.getBean(PersonDAO.class);
			PersonDAO anotherPersonDao = appContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());

			LOGGER.info("{}", anotherPersonDao);
			LOGGER.info("{}", anotherPersonDao.getJdbcConnection());
		}
	}
}
