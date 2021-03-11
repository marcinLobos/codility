package com.company;

import java.util.HashMap;
import java.util.Map;

public class FrogRiverOne {


    public static int solution(int X, int[] A) {

        int time = Integer.MIN_VALUE;
        Map<Integer, Integer> positionsTimeMap = new HashMap();

        for (int i = A.length-1; i >=0 ; i--) {
            positionsTimeMap.put(A[i], i);
        }

        for (Integer t : positionsTimeMap.values()) {
            if (t > time) {
                time = t;
            }
        }

        if (positionsTimeMap.keySet().size() == X) {
            return time;
        } else {
            return -1;
        }


    }

}
