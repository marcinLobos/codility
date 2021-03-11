package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxSumTest {

    @Test
    void miniMaxSum() {

        // given
        int[] arr = {396285104, 573261094, 759641832, 819230764, 364801279};

        // when
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MinMaxSum.miniMaxSum(arr);

        // then

        assertEquals("2093989309 2548418794", outContent.toString());

    }
}