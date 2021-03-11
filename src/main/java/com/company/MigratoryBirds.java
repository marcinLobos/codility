package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        int type = 0;
        int max = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : arr) {

            if (!map.containsKey(integer)) {
                map.put(integer, 1);
            } else {
                map.put(integer, map.get(integer)+1);
            }
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > max) {
                max = integerIntegerEntry.getValue();
                type = integerIntegerEntry.getKey();
            }


        }

        return type;
    }
}
