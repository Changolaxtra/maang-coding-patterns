package com.dan.rojas.maang.binarysearch;

public class RecursiveBinarySearch implements BinarySearch {
    @Override
    public boolean isPresent(int[] array, int valueToFind) {
        return binarySearch(array, 0, array.length - 1, valueToFind);
    }

    private boolean binarySearch(int[] array, int left, int right, int valueToFind) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            // If the element is present at the
            // middle itself
            if (array[mid] == valueToFind) {
                return true;
            }
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (array[mid] > valueToFind) {
                return binarySearch(array, left, mid - 1, valueToFind);
            }
            // Else the element can only be present
            // in right subarray
            return binarySearch(array, mid + 1, right, valueToFind);
        }
        // We reach here when element is not present
        // in array
        return false;
    }
}
