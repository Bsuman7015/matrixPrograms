package com.matrixPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 4, 1);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Sorted numbers: " + numbers);
    }


}
