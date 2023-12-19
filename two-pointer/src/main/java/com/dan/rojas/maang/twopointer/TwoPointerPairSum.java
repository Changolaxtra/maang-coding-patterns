package com.dan.rojas.maang.twopointer;

public class TwoPointerPairSum implements PairSum {

    @Override
    public boolean isPairSum(int[] orderedArray, int sumToFind) {
        final int arraySize = orderedArray.length;
        int firstPointer = 0;
        int secondPointer = arraySize - 1;

        while (firstPointer < secondPointer) {
            if (sumMatches(orderedArray, sumToFind, firstPointer, secondPointer)) {
                return true;
            } else if (isSumLower(orderedArray, sumToFind, firstPointer, secondPointer)) {
                firstPointer++;
            } else { //Sum is Greater
                secondPointer--;
            }
        }
        return false;
    }

    private boolean sumMatches(int[] orderedArray, int sumToFind, int firstPointer, int secondPointer) {
        return orderedArray[firstPointer] + orderedArray[secondPointer] == sumToFind;
    }

    private boolean isSumLower(int[] orderedArray, int sumToFind, int firstPointer, int secondPointer) {
        return orderedArray[firstPointer] + orderedArray[secondPointer] < sumToFind;
    }

}
