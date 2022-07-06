package com.rzldev.spring.introapp;

import com.rzldev.spring.introapp.cdi.CDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
public class IntroAppCDIApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(IntroAppCDIApplication.class);

	public static void main(String[] args) {
//		ApplicationContext appContext = SpringApplication.run(IntroAppCDIApplication.class, args);

		try (AnnotationConfigApplicationContext appContext =
					 new AnnotationConfigApplicationContext(IntroAppCDIApplication.class)) {

			CDIBusiness cdiBusiness = appContext.getBean(CDIBusiness.class);

			LOGGER.info("{}", cdiBusiness);
			LOGGER.info("{}", cdiBusiness.getCdidao());
		}
	}
}
