package com.company;

public class CaceCandle {

    static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < ar.length; i++) {

            if(ar[i] == max) {
                count += 1;
            }

            if(ar[i] > max) {
                max = ar[i];
                count = 1;
            }


        }
        return count;

    }

}
