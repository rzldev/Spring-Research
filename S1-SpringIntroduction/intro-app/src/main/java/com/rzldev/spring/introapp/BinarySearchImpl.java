package com.rzldev.spring.introapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    @Autowired
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumber = sortAlgorithm.sort(numbers);
        System.out.println();

        return numberToSearch;
    }

}
