package ru.itis;

import java.util.Scanner;

public class MASSSIX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        double [] x = new double[n];
        double [] y = new double[n];
        double [] z = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = Math.random();
        }
        for (int i = 1; i < (n - 1); i++) {
            if (x[i] * x[i - 1] < 0) {
                y[i] = 1;
            }
            else {
                y[i] = 0;
            }

            if (x[i - 1] > x[i]) {
                z[i] = 1;
            }
            else {
                z[i] = 0;
            }
        }
    }
}
