package com.company;

import java.util.List;

public class Chockolate {

    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;

        if(s.size() > 1) {
            for(int i = 0; i < s.size() - m +1; i++) {

                for(int j = i; j < i + m; j++) {
                    sum += s.get(j);

                }
                if(sum == d)
                    count++;

                sum = 0;

            }
        } else {
            if(s.get(0)== d)
                count++;
        }

        return count;
    }


}
