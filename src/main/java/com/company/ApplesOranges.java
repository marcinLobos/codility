package com.company;

public class ApplesOranges {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int[] appleCord = new int[apples.length];
        int[] orangesCord = new int[oranges.length];

        for (int i = 0; i < apples.length; i++) {
            appleCord[i] = apples[i] + a;
        }

        for (int j = 0; j < oranges.length; j++) {
            orangesCord[j] = oranges[j] +b;
        }

        int orCount = 0, apCount = 0;

        for (int k = 0; k < appleCord.length; k++) {
            if (appleCord[k] >= s && appleCord[k] <= t)
                apCount++;
        }

        for (int k = 0; k < orangesCord.length; k++) {
            if (orangesCord[k] >= s && orangesCord[k] <= t)
                orCount++;
        }

        System.out.println(apCount);
        System.out.println(orCount);


    }
}
