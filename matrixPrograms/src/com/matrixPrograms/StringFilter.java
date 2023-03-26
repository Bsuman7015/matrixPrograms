package com.matrixPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> filteredWords = words.stream()
                                            .filter(word -> word.length() > 5)
                                            .collect(Collectors.toList());
        System.out.println("Filtered words: " + filteredWords);
    }

}
