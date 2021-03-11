package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayoftheProgrammerTest {

    @Test
    void dayOfProgrammer() {

        // given
        int year = 1918;

        // then

        assertAll("testy",
                () -> assertEquals("26.09.1918", DayoftheProgrammer.dayOfProgrammer(year)),
                () -> assertEquals("12.09.2020", DayoftheProgrammer.dayOfProgrammer(2020))
        );


    }
}