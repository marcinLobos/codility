package com.company;

import java.util.Arrays;

public class ElectronicsShop {

    /**
     * Monica wants to buy a keyboard and a USB drive from her favorite electronics store.
     * The store has several models of each. Monica wants to spend as much as possible for the  items,
     * given her budget.
     * <p>
     * Given the price lists for the store's keyboards and USB drives, and Monica's budget,
     * find and print the amount of money Monica will spend.
     * If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead.
     * She will buy only the two required items.
     */


    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(drives);
        Arrays.sort(keyboards);
        int max = Integer.MIN_VALUE;

        int minDrv = drives[0];
        int minKey = drives[0];

        if (minDrv + minKey > b)
            return -1;

        for (int keyboard : keyboards) {


            int localSum = 0;
            if (b-keyboard >=0 && (returnMaxPosibleVal(drives, b - keyboard, 0, drives.length - 1)>0)) {
                localSum = keyboard + returnMaxPosibleVal(drives, b - keyboard, 0, drives.length - 1);
            }

            if (localSum > max)
                max = localSum;

        }
        return max;

    }


    static public int returnMaxPosibleVal(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                return sortedArray[index];
            }
        }

        if (low == sortedArray.length - 1) {
            if(sortedArray[low]> key)
                return sortedArray[low -1];
            else
                return sortedArray[low];


        } else if (low == 0)

            if(sortedArray[low]> key)
                return 0;
            else
                return sortedArray[low];

        return sortedArray[low - 1];
    }


}
