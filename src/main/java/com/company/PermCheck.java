package com.company;

import java.util.Arrays;

public class PermCheck {


    public static int solution(int[] A) {

        Arrays.sort(A);

        if (A.length == 1 ) {

            if (A[0] == 1) {
                return 1;
            } else {
                return 0;
            }
        }


        if(A[0]!=1 )
            return 0;

        for (int i = 1; i < A.length ; i++) {
            if (!(A[i ] - A[i-1]==1)) {
                return 0;
            }
        }

        return 1;
    }
}
