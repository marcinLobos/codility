package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void countingValleys() {

        // given
        String s = "DDUUUUDD";
        String s2 = "UDDDUDUU";

        // then
        assertAll("testy",

                () -> assertEquals(2, CountingValleys.countingValleys(s.length(), s)),
                () -> assertEquals(1, CountingValleys.countingValleys(s2.length(), s2)),
                () -> assertEquals(2, CountingValleys.countingValleys("DDUUDDUDUUUD".length(), "DDUUDDUDUUUD"))

        );


    }
}