package org.example.sandbox.performance;

public class Example {

    public static void main(String[] args) {

        // O(n)
        for (int n = 0; n <= 10; n++) {
            //do something 11x
        }

        // O(n)
        for (int n = 0; n <= 100; n++) {
            //do something 101x
        }

        // O(n)
        for (int n = 0; n <= 1000; n++) {
            //do something 1001x
        }

        // O(n^2) or O(n*m)
        for (int n = 0; n <= 10; n++) {
            for (int m = 0; m <= 10; m++) {
                //do something 121x
            }
        }

        // O(n^3)
        for (int n = 0; n <= 10; n++) {
            for (int m = 0; m <= 10; m++) {
                for (int o = 0; o <= 10; o++) {
                    //do something 1331x
                }
            }
        }

        // O(1)
        int n = 10;
        n = n + 5;
        int m = n * 57;
        // 3x O(1) = O(1) + O(1) + O(1) = O(1)

        int p = 0;
        for( ; p <= 10; p++) {
            //do something 11x
        }
        // O(1) + O(n) = O(n)

    }



}
