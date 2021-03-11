package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    void pageCount() {

        // given
        int n = 6, p = 2;

        // then
        assertEquals(1, DrawingBook.pageCount(n, p));

    }
}