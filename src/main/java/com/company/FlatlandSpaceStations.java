package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FlatlandSpaceStations {

    static int flatlandSpaceStations(int n, int[] c) {

        Arrays.sort(c);
        ArrayList<Integer> minDistances = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            minDistances.add(returnMinDistance(i, c, i, 0, c.length - 1));

        }

        return Collections.max(minDistances);
    }

    static public int returnMinDistance(int city, int[] sortedArray, int target, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low < high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] > target) {
                if (mid > 0 && target > sortedArray[mid - 1]) {
                    return getMinDistance(target, sortedArray[mid - 1], sortedArray[mid]);
                }
                high = mid - 1;
            } else if (sortedArray[mid] < target) {
                if (mid < sortedArray.length-1 && sortedArray[mid + 1] > target) {
                    return getMinDistance(target, sortedArray[mid + 1], sortedArray[mid]);
                }
                low = mid + 1;
            } else if (sortedArray[mid] == target) {
                index = mid;
                return Math.abs(city - sortedArray[index]);
            }
        }
        return Math.abs(city - sortedArray[low]);
    }


    static public int getMinDistance(int target, int a, int b) {
        return Math.min(Math.abs(target - a), Math.abs(target - b));
    }

}
