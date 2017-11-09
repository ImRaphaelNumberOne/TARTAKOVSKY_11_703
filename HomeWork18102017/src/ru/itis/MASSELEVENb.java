package ru.itis;

import java.util.Scanner;

public class MASSELEVENb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        double [] x = new double[n];
        double [] y = new double[n];
        double [] z = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = Math.random();
            y[i] = Math.random();
            z[i] = Math.random();
        }
        for (int i = 1; i < (n - 1); i++) {
            x[i] = x[i + 1];
            y[i] = y[i + 1];
            z[i] = z[i + 1];
        }
    }
}
