package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChockolateTest {

    @Test
    void birthday() {


        // given

        Integer[] arr = {2, 2, 2, 1, 3, 2, 2, 3, 3, 1, 4, 1, 3, 2, 2, 1, 2, 2, 4, 2, 2, 3, 5, 3, 4, 3, 2, 1, 4, 5, 4};
        List<Integer> arr2 = (List<Integer>) Arrays.asList(arr);

        Integer[] arr3 = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
        List<Integer> arr4 = (List<Integer>) Arrays.asList(arr3);

        // then

        assertAll("testy",
                    () -> assertEquals( 3, Chockolate.birthday(arr4,18,7)),
                    () -> assertEquals( 7, Chockolate.birthday(arr2,10, 4))
        );



    }
}