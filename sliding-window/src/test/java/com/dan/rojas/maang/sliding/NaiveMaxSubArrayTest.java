package com.dan.rojas.maang.sliding;

import org.junit.Test;

import static org.junit.Assert.*;

public class NaiveMaxSubArrayTest {

    @Test
    public void givenArrayItShouldReturnMaxValue() {
        final int[] array = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        final int k = 4;

        final MaxSubArray maxSubArrayNaive = new NaiveMaxSubArray();
        assertEquals(24, maxSubArrayNaive.getMaxSum(array, k));
    }

}