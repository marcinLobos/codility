package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    @Test
    void simpleArray() {

        //given
        int a[] = {3,1,2,4,3};
        int b[] = {3,1,2};

        //when
        int resultTest = TapeEquilibrium.solution(a);
        int resultTest2 = TapeEquilibrium.solution(b);

        //then
        assertEquals(1,resultTest);
        assertEquals(0,resultTest2);
    }

    @Test
    void emptyArray() {

        //given
        int a[] = {};

        //when
        int resultTest = TapeEquilibrium.solution(a);

        //then
        assertEquals(1,resultTest);
    }

    @Test
    void oneElementArray() {

        //given
        int a[] = {3};

        //when
        int resultTest = TapeEquilibrium.solution(a);

        //then
        assertEquals(0,resultTest);
    }

    @Test
    void simpleArraySolution2() {
        //given
        int a[] = {3,1,2,4,3};
        int b[] = {3,1,2};

        //when
        int resultTest = TapeEquilibrium.solution2(a);
        int resultTest2 = TapeEquilibrium.solution2(b);

        //then
        assertEquals(1,resultTest);
        assertEquals(0,resultTest2);
    }

    @Test
    void emptyArraySollution2() {

        //given
        int a[] = {};

        //when
        int resultTest = TapeEquilibrium.solution2(a);

        //then
        assertEquals(1,resultTest);
    }

    @Test
    void oneElementArraySollution2() {

        //given
        int a[] = {6};

        //when
        int resultTest = TapeEquilibrium.solution2(a);

        //then
        assertEquals(0,resultTest);
    }

    @Test
    void simpleArraySolution3() {
        //given
        int a[] = {3,1,2,4,3};
        int b[] = {3,1,2};

        //when
        int resultTest = TapeEquilibrium.solution3(a);
        int resultTest2 = TapeEquilibrium.solution3(b);

        //then
        assertEquals(1,resultTest);
        assertEquals(0,resultTest2);
    }



}