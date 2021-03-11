package com.company;

public class CountingValleys {

    static int countingValleys(int n, String s) {

        int cont = 0;
        boolean trigger = true;
        int noOfValeys = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'D' && trigger) {
                cont++;

                if (cont == 2) {
                    trigger = false;
                    noOfValeys++;
                    cont = 0;
                }

            } else if(s.charAt(i) == 'U') {
                trigger = true;
                cont = 0;
            }

        }

        return  noOfValeys;

    }

    static int countingValleys2(int n, String s) {

        int noOfValeys = 0;
        int heigh = 0;
        int temp = 0;

        for (int i = 0; i < n ; i++) {

            temp = heigh;

            if(s.charAt(i) == 'U')
                heigh++;
            else if(s.charAt(i) == 'D')
                heigh--;


            if(temp == 0 && heigh == -1)
                noOfValeys++;

        }


        return  noOfValeys;

    }

}
