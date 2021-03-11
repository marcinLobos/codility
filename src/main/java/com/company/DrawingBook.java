package com.company;

public class DrawingBook {

    static int pageCount(int n, int p) {

        int start = 0, end = 0;

        if (n % 2 != 0) {
            end = (n - p) / 2;
            if (p % 2 != 0) {
                start = (p - 1) / 2;
            } else {
                start = (p - 1) / 2 + 1;
            }
        } else {

            if (p % 2 != 0) {
                end = (n-p) / 2 + 1;
                start = (p - 1) / 2;
            } else {
                end = (n - p) / 2;
                start = (p - 1) / 2 + 1;
            }
        } 

        return Math.min(start, end);
    }
}
