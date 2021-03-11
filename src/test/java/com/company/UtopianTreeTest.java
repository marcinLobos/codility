package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopianTreeTest {

    @Test
    void utopianTree() {


        assertAll("tree tests",

                () -> assertEquals(7, UtopianTree.utopianTreeRec(4)),
                () -> assertEquals(6, UtopianTree.utopianTreeRec(3)),
                () -> assertEquals(3, UtopianTree.utopianTreeRec(2)),
                () -> assertEquals(2, UtopianTree.utopianTreeRec(1))

        );

    }


    @Test
    void utopianTree2() {


        assertEquals(7, UtopianTree.utopianTreeIter(4));
        assertEquals(14, UtopianTree.utopianTreeIter(5));
    }
}