package com.company;

public class ChockolateFist {

    static int chocolateFeast(int n, int c, int m) {

        int noOfBars = n / c;
        int addBars;
        int noOfPapers = noOfBars;
        do {
            addBars = noOfPapers / m;
            noOfBars += addBars;
            noOfPapers = addBars + noOfPapers % m;

        } while (noOfPapers / m >= 1);

        return noOfBars;
    }
}
