package com.company;

public class BiutyDays {

    static int beautifulDays(int i, int j, int k) {

        int days = 0;
        for (int f = i; f <= j; f++) {
            if (Math.abs(f - revInt(f)) % k == 0) {
                days++;
            }
        }
        return days;
    }


    public static int revInt(int a) {

        int rev = 0;

        while (a > 0) {
            rev = rev * 10 + a % 10;
            a = a / 10;
        }

        return rev;
    }


}
