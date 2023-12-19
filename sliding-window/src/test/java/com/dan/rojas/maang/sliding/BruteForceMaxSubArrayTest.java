package com.dan.rojas.maang.sliding;

import org.junit.Test;

import static org.junit.Assert.*;

public class BruteForceMaxSubArrayTest {

    @Test
    public void givenArrayItShouldReturnMaxValue() {
        final int[] array = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        final int k = 4;

        final MaxSubArray maxSubArrayBrute = new BruteForceMaxSubArray();
        assertEquals(24, maxSubArrayBrute.getMaxSum(array, k));
    }

}