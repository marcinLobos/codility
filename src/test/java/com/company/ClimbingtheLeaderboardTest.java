package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingtheLeaderboardTest {

    @Test
    void returnPositionInTable() {

        //  given
        Integer[] scoresFlat = {100, 50, 40, 20, 10};
        int AliceScore = 25;

        // then
        assertAll("testy",

                () -> assertEquals(4, ClimbingtheLeaderboard.returnPositionInTable(scoresFlat,AliceScore,0, scoresFlat.length-1)),
                () -> assertEquals(6, ClimbingtheLeaderboard.returnPositionInTable(scoresFlat,5,0, scoresFlat.length-1)),
                () -> assertEquals(1, ClimbingtheLeaderboard.returnPositionInTable(scoresFlat,105,0, scoresFlat.length-1))

                );

    }
}