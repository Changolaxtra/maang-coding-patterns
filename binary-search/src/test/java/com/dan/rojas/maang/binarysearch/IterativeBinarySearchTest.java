package com.dan.rojas.maang.binarysearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterativeBinarySearchTest {

    private BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new IterativeBinarySearch();
    }

    @Test
    public void findShouldReturnTrueWithValueInTheMiddle() {
        final int[] array = {2, 3, 4, 10, 40};
        final int toFind = 4;

        assertTrue(binarySearch.isPresent(array, toFind));
    }

    @Test
    public void findShouldReturnTrueWithValueInTheLeft() {
        final int[] array = {2, 3, 4, 10, 40};
        final int toFind = 3;

        assertTrue(binarySearch.isPresent(array, toFind));
    }

    @Test
    public void findShouldReturnTrueWithValueInTheRight() {
        final int[] array = {2, 3, 4, 10, 40};
        final int toFind = 40;

        assertTrue(binarySearch.isPresent(array, toFind));
    }

    @Test
    public void findShouldReturnFalseWithInvalidValue() {
        final int[] array = {2, 3, 4, 10, 40};
        final int toFind = 55;

        assertFalse(binarySearch.isPresent(array, toFind));
    }
}