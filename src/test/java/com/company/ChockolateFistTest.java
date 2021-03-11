package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChockolateFistTest {

    @Test
    void chocolateFeast() {

        // given
        int n = 6, c =2, m = 2;

        assertEquals(5,ChockolateFist.chocolateFeast(n,c,m));
    }
}