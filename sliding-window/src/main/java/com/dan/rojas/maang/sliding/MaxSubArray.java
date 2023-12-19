package com.dan.rojas.maang.sliding;

public interface MaxSubArray {

    /**
     * Finds the maximum sum of a sub array of specific size.
     *
     * @param array        source.
     * @param subArraySize specific size of sub array.
     * @return max sum.
     */
    int getMaxSum(int[] array, int subArraySize);

}
