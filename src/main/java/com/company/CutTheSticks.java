package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        TreeMap<Integer, Integer> noOfDigits = new TreeMap<>();
        for (int i : arr) {
            if (!noOfDigits.containsKey(i))
                noOfDigits.put(i, 1);
            else
                noOfDigits.put(i, noOfDigits.get(i) + 1);
        }
        noOfDigits.remove(noOfDigits.lastKey());
        ArrayList<Integer> list = new ArrayList<>();
        int number = arr.length;
        list.add(number);
        for (Map.Entry<Integer, Integer> entry : noOfDigits.entrySet()) {
            number = number - entry.getValue();
            list.add(number);
        }
        int[] arr2 = new int[list.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = list.get(i);
        }
        return arr2;
    }


}
