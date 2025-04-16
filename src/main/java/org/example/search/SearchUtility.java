package org.example.search;

public class SearchUtility {

    public static int linearSearch(int[] array, int targetValue) {
        int found = -1;
        int index = 0;
        for (int i : array) {
            if (i == targetValue) {
                found = index;
                break;
            }
            index++;
        }

        return found;
    }

    public static int binarySearchRecursive(int[] array, final int targetValue) {

        return binarySearchRecursive(array, 0, (array.length - 1), targetValue);

    }

    public static int binarySearchRecursive(int[] array, int min, int max, final int targetValue) {
        if (min > max) {
            return -1; // Target value not found
        }

        int mid = min + (max - min) / 2;

        if (array[mid] == targetValue) {
            return mid;
        } else if (array[mid] < targetValue) {
            return binarySearchRecursive(array, mid + 1, max, targetValue);
        } else {
            return binarySearchRecursive(array, min, mid - 1, targetValue);
        }
    }

        public static int binarySearchIterative(int[] array, int targetValue)  {
            int min = 0;
            int max = array.length - 1;

            while (min <= max) {
                int mid = min + (max - min) / 2;

                if (array[mid] == targetValue) {
                    return mid;
                } else if (array[mid] < targetValue) {
                    min = mid + 1;
                    // If target is greater, ignore left half of array
                } else {
                    max = mid - 1;
                    // if target is smaller, ignore right half of array
                }
            }

            return -1; // Target value not found
        }

        public static <T extends Comparable<T> >boolean linearSearch(T[] array, T targetValue) {
            boolean found = false;
            for (T t : array) {
                if (t.equals(targetValue)) {
                    found = true;
                    break;
                }
            }
            return found;
        }
    }

