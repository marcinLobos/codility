package com.company;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {


    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> gradesApr = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade % 5 != 0 && grade >= 38 && ((grade / 5) + 1) * 5 - grade < 3) {
                gradesApr.add((grade / 5 + 1) * 5);
            } else {
                gradesApr.add(grade);
            }

        }
        return gradesApr;

    }


}
