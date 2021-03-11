package com.company;

import java.util.Arrays;

public class MaxCounters {

    public static int[] soution(int N, int[] A) {

        int[] arrOfIndexes = new int[N];
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= N) {

                arrOfIndexes[A[i] - 1] += 1;
                if (maxIndex < arrOfIndexes[A[i] - 1]) {
                    maxIndex = arrOfIndexes[A[i] - 1];
                }
            } else {
                if(0> maxIndex)
                    maxIndex=0;

                arrOfIndexes[0] = maxIndex;
//                Arrays.fill(arrOfIndexes, maxIndex);
                for (int j = 1; j <arrOfIndexes.length ; j++) {
                    System.arraycopy( arrOfIndexes,0,arrOfIndexes,j,  ((N - j) < j) ? (N - j) : j);
                }

            }
        }

        return arrOfIndexes;

    }



    public static void bytefill(int[] array, int value) {
        int len = array.length;
        if (len > 0)
            array[0] = value;
        for (int i = 1; i < len; i += i)
            System.arraycopy( array, 0, array, i, ((len - i) < i) ? (len - i) : i);
    }

}
