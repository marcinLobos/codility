package com.company;

public class RotateArray {

    public static void main(String[] args) {

        int[] A = {3, 8, 9, 7, 6};

        int K = 1;

        int[] B = solution(A, K);


        for (int a: B) {
            System.out.print(a + ", ");
        }

    }


    public static int[] solution(int[] A, int K) {

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            B[(i + K) % A.length] = A[i];
        }

        return B;
    }
}
