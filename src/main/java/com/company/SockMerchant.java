package com.company;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        int noOfPairs = 0;
        Map<Integer, Integer> prices = new HashMap<>();

        for (int i = 0; i < ar.length ; i++) {

            if (!prices.containsKey(ar[i])) {
                prices.put(ar[i], 1);
            } else {
                prices.put(ar[i], prices.get(ar[i])+1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : prices.entrySet()) {
            noOfPairs += entry.getValue()/2;
        }

        return noOfPairs;
    }
}
