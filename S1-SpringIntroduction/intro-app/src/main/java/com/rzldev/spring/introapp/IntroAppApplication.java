package com.rzldev.spring.introapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IntroAppApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearchImpl.binarySearch(new int[] {12, 6, 2}, 3);
//		System.out.println(result);

		ApplicationContext appContext = SpringApplication.run(IntroAppApplication.class, args);

		BinarySearchImpl binarySearchImpl = appContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {12, 6, 2}, 3);
		System.out.println(result);
	}

}
