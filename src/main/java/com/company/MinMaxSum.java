package com.company;

public class MinMaxSum {

    public static void miniMaxSum(int[] arr) {

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sumTotal = 0;

        for (int k: arr)
            sumTotal += k;

        for (int i = 0; i < arr.length ; i++) {

            if(sumTotal - arr[i] < min )
                min = sumTotal - arr[i];

            if(sumTotal - arr[i] > max )
                max = sumTotal - arr[i];
        }

        System.out.print(min + " " + max);



    }

}
