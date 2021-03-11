package com.company;

public class RootMeanSquareError {

    public static double solution(double[] predicted, double[] observed) {

        double result = 0.0d;

        if (predicted.length != observed.length) {
            throw  new IllegalArgumentException(String.format("The sizes of the arrays are not equals: %d != %d.", predicted.length, observed.length));
        }

        for (int i = 0; i < predicted.length; i++) {
            result += (predicted[i] - observed[i]) * (predicted[i] - observed[i]);
        }

        result = Math.sqrt(result / predicted.length);
        return result;
    }
}
