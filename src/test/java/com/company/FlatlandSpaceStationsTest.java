package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatlandSpaceStationsTest {

    @Test
    void flatlandSpaceStations() {

        int[] stations = {13, 1, 11, 10, 6};
        int n = 20;

        assertEquals(6, FlatlandSpaceStations.flatlandSpaceStations(n, stations));
    }
}