package com.dan.rojas.maang.sliding;

public class NaiveMaxSubArray implements MaxSubArray {

    @Override
    public int getMaxSum(int[] array, int subArraySize) {
        final int arraySize = array.length;

        if (subArraySize > arraySize) {
            throw new IllegalArgumentException("Invalid subArraySize");
        }

        int maxSum = Integer.MIN_VALUE;
        final int adjustedSize = arraySize - subArraySize + 1;

        for (int i = 0; i < adjustedSize; i++) {
            int currentSum = 0;
            for (int j = 0; j < subArraySize; j++) {
                currentSum = currentSum + array[i + j];
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

}
