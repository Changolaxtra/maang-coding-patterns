package com.dan.rojas.maang.sliding;


public class SlidingWindowMaxSubArray implements MaxSubArray {

    @Override
    public int getMaxSum(int[] array, int subArraySize) {
        final int arraySize = array.length;

        if (subArraySize > arraySize) {
            throw new IllegalArgumentException("Invalid subArraySize");
        }

        int firstWindowSum = 0;
        for (int i = 0; i < subArraySize; i++) {
            firstWindowSum += array[i];
        }

        int maxSum = firstWindowSum;

        int windowSum = maxSum;
        for (int i = subArraySize; i < arraySize; i++) {
            int currentElement = array[i];
            int firstElementOfPreviousWindow = array[i - subArraySize];
            windowSum += currentElement - firstElementOfPreviousWindow;
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
