package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootMeanSquareErrorTest {

    @Test
    void solution() {

        //given
        double[] pred = {4, 25, 0.75, 11};
        double[] res = {3, 21, -1.25, 13};

        //when
        double result = RootMeanSquareError.solution(pred, res);

        //then
        System.out.println( "moj wynik to: " + result);
        assertEquals(2.5, result);

    }
}