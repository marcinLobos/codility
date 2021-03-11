package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5};
        int b = solution(a);

        System.out.println(b);
    }

    public static int solution(int[] A) {
// problemy z wartosiami brzegowymi jak brakuje poczatkowego lub koncowego, co jak A ma tylko 2 elementy
        int result = 1;
        Arrays.sort(A);

        if (A.length == 0)
            return 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i + 1] - A[i] > 1) {
                result = i + 2;
                break;
            }
        }
        return result;
    }


    public static int solution2(int[] A) {
        // to lepsze rowiazanie
        Set<Integer> set = new HashSet<>();

        for (int k : A) {
            set.add(k);
        }

        for (int i = 1; i <= A.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
