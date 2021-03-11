package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaceCandleTest {

    @Test
    void birthdayCakeCandles() {

        // given
        int[] arr = {3, 2, 1, 3};

        // then

        assertEquals(2, CaceCandle.birthdayCakeCandles(arr));

    }
}