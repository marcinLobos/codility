package com.company;



import java.util.Random;

public class ServiceLine {


    static int[] serviceLane(int n, int[][] cases, int[] w) {

        int min = Integer.MAX_VALUE;
        int ret[] = new int[cases.length];

        for (int k = 0; k < cases.length; k++) {
            for (int i = cases[k][0]; i < cases[k][1]; i++) {

                if( w[i] < min)
                    min = w[i];

            }
            ret[k] = min;
            min = 3;
        }

        return ret;
    }


    public static void main(String[] args) {

        int[] width = new int[10000];
        Random r = new Random();

        for (int i = 0; i < width.length; i++) {
            width[i] = r.nextInt(2) + 1;
        }





    }


}
