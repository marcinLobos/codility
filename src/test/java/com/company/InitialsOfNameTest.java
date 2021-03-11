package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialsOfNameTest {

    @Test
    void solution() {

        //given
        String name = "John";
        String surname = "Firelord";
        int age = 8;

        //when
        String result = InitialsOfName.solution(name, surname, age);

        //then
        assertEquals("JoFi8", result);

    }
}