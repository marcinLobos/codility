package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClimbingtheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        List flatScores = new ArrayList<Integer>();
        List positonScores = new ArrayList<Integer>();
        //int[] flatScorestArr;
        int[] ddd = new int[3];

        flatScores.add(scores[0]);

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] < scores[i - 1])
                flatScores.add(scores[i]);

        }

       Integer[] flatScorestArr = (Integer[]) flatScores.toArray(new Integer[flatScores.size()]);

        for (int i = 0; i < alice.length ; i++) {

            positonScores.add( returnPositionInTable(flatScorestArr, alice[i],0, flatScores.size() -1)  );
        }

        Integer[] positionScorestArr = (Integer[]) positonScores.toArray(new Integer[positonScores.size()]);
        int[] table = new int[positionScorestArr.length];

        for (int i = 0; i < table.length; i++) {
            table[i] = positionScorestArr[i];
        }

        return table;


    }

    static public int returnPositionInTable(Integer[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] > key) {
                low = mid + 1;
            } else if (sortedArray[mid] < key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }

        if(low > high)
            index = high + 1;

        return index +1;
    }

}
