package com.company;

import java.util.Arrays;

public class LisaWorkBook {

    static int workbook(int n, int k, int[] arr) {

        int totalProblems = Arrays.stream(arr).sum();
        int problemNo = 0;
        int curentChapterNdx = 0;
        int noOfPage = 1;
        int totalMagic = 0;

        for (int i = 1; i <= totalProblems; i++) {
            problemNo++;

            if (problemNo>1 && (problemNo-1) % k == 0 && problemNo <= arr[curentChapterNdx] ) {
                noOfPage++;
            }

            if (problemNo > arr[curentChapterNdx]) {
                problemNo = 1;
                curentChapterNdx++;
                noOfPage++;
            }

            if (noOfPage == problemNo) {
                totalMagic++;
            }
        }

        return totalMagic;
    }
}
