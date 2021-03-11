package com.company;

public class ACMICPCTeam {

    public static void main(String[] args) {

        String bity = "11001";
        String bity2 = "11100";

        int bityInt = Integer.parseInt(bity, 2);
        int bity2Int = Integer.parseInt(bity2, 2);
        int a = Integer.bitCount(bityInt | bity2Int);

        System.out.println(a);


    }

    static int[] acmTeam(String[] topic) {

        int[] arr  = {1,2};

        


        return  arr;

    }
}
