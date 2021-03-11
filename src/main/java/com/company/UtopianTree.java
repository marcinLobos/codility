package com.company;

public class UtopianTree {

    static int utopianTreeRec(int n) {

        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 0)
                return utopianTreeRec(n - 1) + 1;
            else
                return utopianTreeRec(n - 1) * 2;
        }
    }


    static int utopianTreeIter(int n) {

        int h = 1;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0)
                h = h + 1;
            else
                h = h * 2;
        }

        return h;
    }

}
