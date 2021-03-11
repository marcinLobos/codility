package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void timeConversion() {

        // given
        String timeAMPM = "07:05:45PM";

        // when
        String timeMilitary = TimeConversion.timeConversion(timeAMPM);

        // then
        assertAll("time test",

                () -> assertEquals("19:05:45", timeMilitary),
                () -> assertEquals("07:12:45", TimeConversion.timeConversion("07:12:45AM")),
                () -> assertEquals("19:12:45", TimeConversion.timeConversion("07:12:45PM")),
                () -> assertEquals("23:12:45", TimeConversion.timeConversion("11:12:45PM"))

                );

    }
}