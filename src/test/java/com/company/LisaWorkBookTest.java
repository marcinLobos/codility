package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LisaWorkBookTest {

    @Test
    void workbook() {

        // given
        int[] arr = {4,2,6,1,10};
        int n = 5, k = 3;

        // then
        assertEquals(4, LisaWorkBook.workbook(n, k, arr));

    }
}