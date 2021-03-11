package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendAndDeleteTest {

    @Test
    void appendAndDelete() {

        // given

        String s = "aba";
        String t = "aba";
        int k = 7;

        String s2 = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
        String t2 = "asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv";
        int k2 = 20;

if (s2.equals(t2))
    System.out.println("sa rowne");


        System.out.println(s2.length());
        // then

        assertEquals("Yes", AppendAndDelete.appendAndDelete(s, t, k));
        assertEquals("Yes", AppendAndDelete.appendAndDelete(s2, t2, k2));


    }
}