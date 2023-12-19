package com.dan.rojas.maang.binarysearch;

public class IterativeBinarySearch implements BinarySearch {

    @Override
    public boolean isPresent(int[] array, int valueToFind) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            // Check if valueToFind is present at mid
            if (array[middle] == valueToFind) {
                return true;
            }
            // If valueToFind greater, ignore left half
            if (array[middle] < valueToFind) {
                left = middle + 1;
            }
            // If valueToFind is smaller, ignore right half
            else {
                right = middle - 1;
            }
        }
        return false;
    }
}
