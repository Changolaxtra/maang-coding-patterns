package com.dan.rojas.maang.twopointer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NaivePairSumTest {

    private PairSum pairSum;

    @Before
    public void setUp() {
        pairSum = new NaivePairSum();
    }

    @Test
    public void givenArrayAndNumberShouldFindThePair() {
        final int[] orderedArray = {2, 3, 5, 8, 9, 10, 11};
        final int sumToFind = 17;

        assertTrue(pairSum.isPairSum(orderedArray, sumToFind));
    }

    @Test
    public void givenArrayAndNumberWithRepeatedElementsShouldFindThePair() {
        final int[] orderedArray = {2, 3, 5, 8, 8, 10, 11};
        final int sumToFind = 16;

        assertTrue(pairSum.isPairSum(orderedArray, sumToFind));
    }

    @Test
    public void givenArrayAndNumberShouldNotFindThePair() {
        final int[] orderedArray = {2, 3, 5, 8, 9, 10, 11};
        final int sumToFind = 25;

        assertFalse(pairSum.isPairSum(orderedArray, sumToFind));
    }

}