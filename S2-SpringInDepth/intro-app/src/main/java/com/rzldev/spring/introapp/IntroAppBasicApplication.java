package com.rzldev.spring.introapp;

import com.rzldev.spring.introapp.basic.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.rzldev.spring.introapp")
public class IntroAppBasicApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearchImpl.binarySearch(new int[] {12, 6, 2}, 3);
//		System.out.println(result);

//		ApplicationContext appContext = SpringApplication.run(IntroAppBasicApplication.class, args);

		try (AnnotationConfigApplicationContext appContext =
					 new AnnotationConfigApplicationContext(IntroAppBasicApplication.class)) {
			BinarySearchImpl binarySearchImpl = appContext.getBean(BinarySearchImpl.class);
			int result = binarySearchImpl.binarySearch(new int[]{12, 6, 2}, 3);
			System.out.println(result);

			System.out.println("binarySearchImpl: " + binarySearchImpl);
			BinarySearchImpl secondBinarySearchImpl = appContext.getBean(BinarySearchImpl.class);
			System.out.println("secondBinarySearchImpl: " + secondBinarySearchImpl);
		}
//		appContext.close();
	}

}
