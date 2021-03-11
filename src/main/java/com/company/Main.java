package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        // write your code here

        int[] tablica = {9, 3, 9, 3, 9, 7, 9};

        int dd = solution(tablica);
        int dd2 = soluction2(tablica);
        int dd3 = soluction3(tablica);

        System.out.println(dd);
        System.out.println(dd2);
        System.out.println(dd3);


        String s ="0", s1 = "0";
        System.out.println(s.codePointAt(0));

        System.out.println("1"+5);


        for (int i = 0; i < 5; i++)
        {
            s = s + i;
        }
        System.out.println(s);



    }


    public static int solution(int[] A) {

        int[] indxTab = new int[1000003];
        int number = -1;

        for (int i = 0; i < A.length; i++) {
            indxTab[A[i]] += 1;
        }

        for (int j = 0; j < indxTab.length; j++) {
            if (indxTab[j] % 2 != 0) {
                number = j;
                break;
            }
        }
        return number;
    }


    public static int soluction2(int[] A) {

        int number = -1;
        HashMap<Integer, Integer> howManyNumbers = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if (howManyNumbers.containsKey(A[i])) {
                int count = howManyNumbers.get(A[i]);
                howManyNumbers.put(A[i], count + 1);
            } else {

                howManyNumbers.put(A[i], 1);
            }

        }

        for (Map.Entry k : howManyNumbers.entrySet()) {
            if (((Integer) k.getValue()) % 2 != 0) {
                number = (Integer) k.getKey();
                break;
            }
        }
        return number;
    }


    public static int soluction3(int[] A) {

        int number = 0;

        for (int k : A) {
            number ^= k;
        }

        return number;
    }





}
