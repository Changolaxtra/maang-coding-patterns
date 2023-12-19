package com.dan.rojas.maang.twopointer;

public class NaivePairSum implements PairSum {

    @Override
    public boolean isPairSum(int[] orderedArray, int sumToFind) {
        final int arraySize = orderedArray.length;

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (sumMatches(orderedArray, sumToFind, i, j)) {
                    return true;
                }
                if (isSumGreaterThanFind(orderedArray, sumToFind, i, j)) {
                    break;
                }
            }
        }

        return false;
    }

    private boolean sumMatches(int[] orderedArray, int sumToFind, int i, int j) {
        return orderedArray[i] + orderedArray[j] == sumToFind;
    }

    private boolean isSumGreaterThanFind(int[] orderedArray, int sumToFind, int i, int j) {
        return orderedArray[i] + orderedArray[j] > sumToFind;
    }

}
