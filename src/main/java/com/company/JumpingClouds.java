package com.company;

public class JumpingClouds {

    static int jumpingOnClouds(int[] c) {

        int jumps=0;
        int index = 0;

        while (index < c.length-1) {
            if (index +2 < c.length && c[index + 2] != 1  ) {
                index += 2;
                jumps++;
            } else {
                index++;
                jumps++;
            }
        }

        return jumps;
    }
}
