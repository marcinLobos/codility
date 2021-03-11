package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    void solution() {

        // given
        int a[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        //when
        int result = FrogRiverOne.solution(X, a);


        //then
        assertEquals(6, result);
    }
}