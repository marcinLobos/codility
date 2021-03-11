package com.company;

import java.util.HashMap;

public class EqualizeArray {

    static int equalizeArray(int[] arr) {

        int size = arr.length;
        HashMap<Integer, Integer> numbersCount = new HashMap<>();

        for (int i : arr) {
            if (numbersCount.containsKey(i)) {
                numbersCount.put(i, numbersCount.get(i) + 1);
            } else {
                numbersCount.put(i, 1);
            }
        }
        int maxNoOfSomeNo = 0;

        for (Integer value : numbersCount.values()) {
            if(value> maxNoOfSomeNo) maxNoOfSomeNo = value;
        }


        return size - maxNoOfSomeNo;

    }


}
