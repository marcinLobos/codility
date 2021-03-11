package com.company;

public class ReapetedStrings {

    static long repeatedString(String s, long n) {

        long ileString = n / (s.length());
        long ileReszta = n % (s.length());
        long ileWString = 0;
        long ileWReszcieString = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                ileWString++;
        }

        for (int i = 0; i < ileReszta; i++) {
            if (s.charAt(i) == 'a')
                ileWReszcieString++;
        }

        return ileString*ileWString + ileWReszcieString;
    }

}
