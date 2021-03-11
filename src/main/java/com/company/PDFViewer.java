package com.company;

import java.util.HashMap;
import java.util.Map;

public class PDFViewer {

    /**
     * In this challenge, you will be given a list of letter heights in the alphabet and a string.
     * Using the letter heights given, determine the area of the rectangle highlight in mm^2 assuming all letters are 1mm wide.
     */

    static int designerPdfViewer(int[] h, String word) {

        Map<Character,Integer> lettersHeights = new HashMap<>();
        char letter = 'a';

        for (int i = 0; i < 26 ; i++)
            lettersHeights.put(letter++,h[i]);

        int max = 0; // height of highest letter in word

        for (int i = 0; i < word.length() ; i++) {
            if (lettersHeights.get(word.charAt(i)) > max) {
                max = lettersHeights.get(word.charAt(i));
            }
        }

        return max * word.length();

    }




}
