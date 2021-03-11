package com.company;

import java.util.Arrays;

public class MissingInteger {

    public static int solution(int[] A) {

        /**
         that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
         For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
         Given A = [1, 2, 3], the function should return 4.
         Given A = [−1, −3], the function should return 1.
         */

        int biggestInteger = 0;
        Arrays.sort(A);

// check if all numbers are negative
        boolean isAllNumbersNegative = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                isAllNumbersNegative = false;
                break;
            }
        }

        // if all numbers are negative ones
        if (isAllNumbersNegative)
            return 1;


// single element case
        if (A.length == 1)
            if (A[0] != 1)
                return 1;
            else
                return 2;

// if first element is positive and it is not 1 then 1 will be the answer
        if(A[0]>1)
            return 1;


//        find missing element if it eexist

        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] > 1) { // you have break point here
                 if(A[i-1]<=0 && A[i]>1)
                     return 1;
                 if(A[i-1]<=0 && A[i]==1)
                     continue;

                return A[i-1] + 1;
            }
        }

//        if where is no missing element then smallest integer will be +1 of the last element of array

        biggestInteger = A[A.length - 1] + 1;

        return biggestInteger;
    }
}
