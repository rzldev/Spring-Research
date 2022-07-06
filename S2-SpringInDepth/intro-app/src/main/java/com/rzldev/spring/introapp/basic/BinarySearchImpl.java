package com.rzldev.spring.introapp.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

//    @Autowired
//    private SortAlgorithm bubbleSortAlgorithm;

    @Autowired
    @Qualifier("simple")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumber = sortAlgorithm.sort(numbers);
        System.out.println();

        return numberToSearch;
    }

//    @PostConstruct
//    public void postConstruct() {
//        LOGGER.info("PostConstruct");
//    }

//    @PreDestroy
//    public void destroy() {
//        LOGGER.info("PreDestroy");
//    }
}
