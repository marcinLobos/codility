package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PDFViewerTest {

    @Test
    void designerPdfViewer() {

        // given
        String word = "abc";
        String word2 = "zaba";
        int[] heighs = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] heighs2 = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};

        // when

        int area = PDFViewer.designerPdfViewer(heighs, word);
        int area2 = PDFViewer.designerPdfViewer(heighs2, word2);

        // then

        assertAll("tests",

                () -> assertEquals(9, area),
                () -> assertEquals(28, area2)

        );


    }
}