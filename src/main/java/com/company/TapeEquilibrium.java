package com.company;

public class TapeEquilibrium {

    public static void main(String[] args) {

        int[] a = {3, 1, 2, 4, 3};

        int b = solution(a);
        System.out.println(b);
    }


    public static int solution(int[] A) {

        int minSum = Integer.MAX_VALUE;
        int sumA, sumB, diff, totalSum;
        sumA = sumB = totalSum = 0;

        if (A.length == 0)
            return 1;
        else if (A.length == 1)
            return 0;
        else if (A.length == 2)
            return Math.abs(A[0] - A[1]);

        // calculate total sum
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        for (int i = 0; i < A.length; i++) {


            for (int j = 0; j <= i; j++) {
                sumA += A[j];
            }

            sumB = totalSum - sumA;


            diff = Math.abs(sumA - sumB);
            if (diff < minSum) {
                minSum = diff;
            }
            sumA = sumB = 0;
        }
        return minSum;

    }


    public static int solution2(int[] A) {
        // double indexes approach

        int minSum = Integer.MAX_VALUE;
        int sumA, sumB, diff;
        sumA = sumB = 0;

        if (A.length == 0)
            return 1;
        else if (A.length == 1)
            return 0;
        else if (A.length == 2)
            return Math.abs(A[0] - A[1]);


        for (int i = 0, j = A.length - 1; i <= j; ) {

            if (sumA <= sumB) {
                sumA += A[i];
                i++;
            } else {
                sumB += A[j];
                j--;
            }
        }

        diff = Math.abs(sumA - sumB);
        if (diff < minSum) {
            minSum = diff;
        }
        return minSum;
    }

    public static int solution3(int[] A) {

        int minSum = Integer.MAX_VALUE;
        int[] arrOfLeftSums = new int[A.length];
        int[] arrOfRightSums = new int[A.length];

        // set first element in arrLeft
        arrOfLeftSums[0] = A[0];

        // set last in arrRight (we fill it from right side)
        arrOfRightSums[A.length - 1] = A[A.length - 1];

        // fill arrLeft
        for (int i = 1; i < A.length; i++) {
            arrOfLeftSums[i] = arrOfLeftSums[i - 1] + A[i];
        }
        // fill arrRight
        for (int j = A.length - 2; j >= 0; j--) {
            arrOfRightSums[j] = A[j] + arrOfRightSums[j + 1];
        }

        // compare sums
        for (int k = 0; k < A.length-1 ; k++) {
            int sumLeft = arrOfLeftSums[k];
            int sumRight = arrOfRightSums[k + 1];

            int diff = Math.abs(sumLeft - sumRight);

            if (diff < minSum) {
                minSum = diff;
            }
        }
        return minSum;
        // this solution is the best, it has performance O(3N)
    }


}
