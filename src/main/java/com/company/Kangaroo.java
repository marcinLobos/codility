package com.company;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        String canMeet = "";
        boolean firstRun;
        if (v1 > v2)
            firstRun = true;
        else
            firstRun = false;


        while (true) {

            if (x1 == x2) {
                canMeet = "YES";
                break;
            }

            if (x1 > x2 && firstRun) {
                canMeet = "NO";
                break;
            }

            if (x2 > x1 && !firstRun) {
                canMeet = "NO";
                break;
            }

            x1 = x1 + v1;
            x2 = x2 + v2;

        }


        return canMeet;
    }
}
