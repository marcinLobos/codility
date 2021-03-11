package com.company;

public class SherlockAndSquares {

    static int squares(int a, int b) {
        int counter = 0;
        int start = (int) Math.ceil(Math.sqrt(a));
        int end = (int) Math.floor(Math.sqrt(b));

        for (int i = start; i <= end; i++) {
            if (i*i >= a && i*i <=b) {
                counter++;
            }
        }

        return counter;
    }


    public static void main(String[] args) {
        System.out.println(Math.sqrt(26) - Math.floor(Math.sqrt(26)) == 0);
    }
}
