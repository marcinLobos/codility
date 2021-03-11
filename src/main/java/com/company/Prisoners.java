package com.company;

public class Prisoners {

    public static int saveThePrisoner(int n, int m, int s) {
        int index = s-1;
//        for(int i = 0; i < m-1; i++) {
//            index = (index + 1) % n;
//
//        }

        index = (index + m-1)%n;
        return index+1;

    }
}
