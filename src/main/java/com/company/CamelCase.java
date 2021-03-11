package com.company;

public class CamelCase {

    static int camelcase(String s) {
        int noOfWords = 0;
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (Character.isUpperCase(letters[i])) {
                noOfWords++;
            }
        }
        return noOfWords +1;
    }
}
