package com.company;

public class AppendAndDelete {

    /**
     * https://www.hackerrank.com/challenges/append-and-delete/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     *
     */

    static String appendAndDelete(String s, String t, int k) {

        int rest = Math.abs(s.length() - t.length());
        int doubles = 0;
        int indexR = 0;

        if (s.length() <= t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    indexR = i;

                }else
                    break;


            }
            doubles = 2* (s.length()- indexR-1);
        } else {
            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    indexR = i;

                } else
                    break;
            }
            doubles = 2* (t.length()- indexR-1);
        }

        if (k > (doubles + rest)) {
            int toBurn = k - (doubles + rest);

            if( isBurnable(toBurn,indexR))
                return "Yes";
            else
                return "No";


        } else if (k == (doubles + rest)) {

            return "Yes";
        } else {
            return "No";
        }


    }


    public static boolean isBurnable(int k, int rightIndex ) {

        int noOfSteps = rightIndex+1;

        if (k > noOfSteps * 2) {
            return true;
        } else if (k % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
