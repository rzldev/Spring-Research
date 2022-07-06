package com.rzldev.spring.introapp;

import com.rzldev.spring.introapp.scope.PersonDAO;
import com.rzldev.spring.introapp.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroAppXMLContextApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(IntroAppXMLContextApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext appContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object) appContext.getBeanDefinitionNames());

			XMLPersonDAO xmlPersonDAO = appContext.getBean(XMLPersonDAO.class);

			LOGGER.info("{}", xmlPersonDAO);
			LOGGER.info("{}", xmlPersonDAO.getJdbcConnection());
		}
	}
}
