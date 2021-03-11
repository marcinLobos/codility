package com.company;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int noOfPairs = 0;

        for (int i = 0; i < ar.length ; i++) {
            for (int j = i+1 ; j < ar.length ; j++) {
                if ((ar[i] + ar[j]) % k == 0)
                    noOfPairs++;

            }
        }

        return noOfPairs;
        // works but is it possible to make it no N2 type of algorithm?
    }


}
