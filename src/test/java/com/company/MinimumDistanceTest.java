package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceTest {

    @Test
    void minimumDistances() {

        String arrStr = "7 1 3 4 1 7";
        String[] arrStr2 = arrStr.split(" ");

        int[] arr = new int[arrStr2.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr2[i]);
        }


        assertEquals(3, MinimumDistance.minimumDistances(arr));


    }
}