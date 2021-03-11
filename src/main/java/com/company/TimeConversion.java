package com.company;

public class TimeConversion {

    static String timeConversion(String s) {

        String time;
        if (s.substring(s.length() - 2).equals("AM")) {

            if (s.substring(0, 2).equals("12")) {

                time = "00" + s.substring(2, s.length() - 2);

            } else {
                time = s.substring(0, s.length() - 2);
            }


        } else {
            String h = s.substring(0,2);
            int h2 = Integer.parseInt(h);
            if (h.equals("12")) {
                h2 = 12;
            } else {
                h2 += 12;
            }

            time = h2 + s.substring(2,s.length()-2);
        }

        return time;
    }


}
