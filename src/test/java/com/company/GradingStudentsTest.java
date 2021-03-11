package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    @Test
    void gradingStudents() {

        // given
        List<Integer> grades = new ArrayList<>( Arrays.asList(73, 67, 38, 33));
        List<Integer> expected = new ArrayList<>( Arrays.asList(75, 67, 40, 33));

        // when
        List<Integer> apr = GradingStudents.gradingStudents(grades);

        //then
        assertEquals(expected, apr);

    }
}