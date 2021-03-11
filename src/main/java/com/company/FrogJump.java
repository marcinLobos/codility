package com.company;

public class FrogJump {

    public static void main(String[] args) {


    }


    public static int solution(int X, int Y, int D) {

        int result;

        if ((Y - X) % D == 0)
            result = (Y - X) / D;
        else
            result = (Y - X) / D + 1;

        return result;
    }
}
