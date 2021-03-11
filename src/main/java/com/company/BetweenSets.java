package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BetweenSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int noOffactors = 0;
        int start = Collections.max(a);
        int end = Collections.min(b);

        for (int i = start; i < end + 2; i++) {
            if(isValidCandidate(a,b,i))
                noOffactors++;

        }
        return noOffactors;
    }


    public static boolean isValidCandidate(List<Integer> a, List<Integer> b, int candidate) {

        for (Integer integer : a) {
            if (candidate % integer != 0)
                return false;

        }

        for (Integer integer : b) {
            if (integer % candidate != 0)
                return false;
        }

        return true;
    }

}
