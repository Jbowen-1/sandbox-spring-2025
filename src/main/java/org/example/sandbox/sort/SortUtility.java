package org.example.sandbox.sort;

public class SortUtility {

    private SortUtility() {
        // Prevent instantiation
    }

    // O(n^2)
    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {

            // Assume first value is min
            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {

                // Find minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }

            }

            // Swap minimum value with lowest index
            swap(data, min, index);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int min, int index) {
        T temp = data[min];
        data[min] = data[index];
        data[index] = temp;
    }

    // O(n^2)
    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {

            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;

        }
    }

    // O(n^2)
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {

        int position, scan;

        for (position = data.length - 1; position >= 0; position--) {

            for (scan = 0; scan <= position - 1; scan++) {
                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    swap(data, scan, scan + 1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void quickSort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
        if (min < max) {
            int pivotIndex = partition(data, min, max);
            quickSort(data, min, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, max);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {

        T pivot = data[min];
        int left = min + 1;
        int right = max;

        while (left <= right) {
            while (left <= right && data[left].compareTo(pivot) <= 0) {
                left++;
            }
            while (left <= right && data[right].compareTo(pivot) >= 0) {
                right--;
            }
            if (left < right) {
                swap(data, left, right);
            }
        }
        swap(data, min, right);
        return right;
    }

    private static <T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {
        if (min < max) {
            int mid = (min + max) / 2;
            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);
            merge(data, min, mid, max);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] data, int min, int mid, int max) {
        // merge two sorted subarrays into a single sorted array

        int leftIndex = min;
        int rightIndex = mid + 1;
        int mergedIndex = 0;

        T[] mergedArray = (T[]) new Comparable[max - min + 1];

        // merge the two halves
        while (leftIndex <= mid && rightIndex <= max) {
            if (data[leftIndex].compareTo(data[rightIndex]) < 0) {
                mergedArray[mergedIndex++] = data[leftIndex++];
            } else {
                mergedArray[mergedIndex++] = data[rightIndex++];
            }
        }

        // copy any remaining elements from the left half
        while (leftIndex <= mid) {
            mergedArray[mergedIndex++] = data[leftIndex++];
        }

        // copy any remaining elements from the right half
        while (rightIndex <= max) {
            mergedArray[mergedIndex++] = data[rightIndex++];
        }

        System.arraycopy(mergedArray, 0, data, min, mergedArray.length);


    }

}
