package com.company;

import java.util.*;

public class MinimumDistance {

    static int minimumDistances(int[] a) {

        Map<Integer, ArrayList<Integer>> numbers = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (!numbers.containsKey(a[i])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                numbers.put(a[i], list);
            } else {
                numbers.get(a[i]).add(i);
            }
        }

        ArrayList<Integer> distances = new ArrayList<>();

        for (ArrayList<Integer> distArr : numbers.values()) {
            if (distArr.size()>1) {
                distances.add(Math.abs(distArr.get(0) - distArr.get(1)));
            }
        }

        if (distances.size() > 0) {
            return Collections.min(distances);
        } else {
            return -1;
        }


    }
}
