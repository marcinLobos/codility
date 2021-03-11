package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisonersTest {

    @Test
    void saveThePrisoner() {

        // given
        int n = 3, m = 7, s = 3;

        //then

        assertEquals(3, Prisoners.saveThePrisoner(n, m, s));
    }
}