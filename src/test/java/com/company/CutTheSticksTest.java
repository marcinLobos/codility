package com.company;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class CutTheSticksTest {

    @Test
    void cutTheSticks() {

        // given
        int[] arr = {5, 4, 4, 2, 2, 8};

        int[] resultArr = {6, 4, 2, 1};


       // then




        assertArrayEquals(resultArr, CutTheSticks.cutTheSticks(arr));


    }
}