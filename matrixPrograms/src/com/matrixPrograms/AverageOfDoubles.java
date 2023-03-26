package com.matrixPrograms;

import java.util.Arrays;
import java.util.List;

public class AverageOfDoubles {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        double average = numbers.stream()
                                .mapToDouble(Double::doubleValue)
                                .average()
                                .orElse(Double.NaN);
        System.out.println("Average of all doubles: " + average);
    }


}
