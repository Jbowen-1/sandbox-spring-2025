package org.example.search;

import static java.util.Arrays.stream;

public class SearchDriver {

    public static void main(String[] args) {
        int[] intArray = {2, 4, 6, 5, 3, 1, 2, 1, 0};

        int[] integerArray = stream(intArray)
                .sorted()
                .toArray();

        System.out.println(SearchUtility.linearSearch(integerArray, 1));
        System.out.println(SearchUtility.linearSearch(integerArray, 10));

        System.out.println(SearchUtility.binarySearchRecursive(integerArray, 1));
        System.out.println(SearchUtility.binarySearchRecursive(integerArray, 10));

        System.out.println(SearchUtility.binarySearchIterative(integerArray, 1));
        System.out.println(SearchUtility.binarySearchIterative(integerArray, 10));
    }
}
