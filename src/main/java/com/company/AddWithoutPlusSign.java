package com.company;

public class AddWithoutPlusSign {

    static public int add(int x, int y) {

        int sum = 0, carryBit;

        if (y == 0) {
            return x;
        } else {
            sum = x ^ y;
            carryBit = x & y;
            carryBit = carryBit << 1;

            return add(sum, carryBit);
        }


    }

    static public int add2(int x, int y) {

        int sum = 0, carryBit = 0;

        do {
            sum = x ^ y;
            carryBit = x & y;
            carryBit = carryBit << 1;

            x = sum;
            y = carryBit;

        } while (carryBit != 0);

        return sum;
    }


    public static void main(String[] args) {

        System.out.println(add(-5, -55));
        System.out.println(add2(-5, -55));

    }

}
