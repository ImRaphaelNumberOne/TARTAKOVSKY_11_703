package ru.itis;

import java.util.Scanner;

public class MASSex11a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        double [] x = new double[n];
        double [] y = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = Math.random();
        }
        for (int i = 0; i < n; i++) {
            y[i] = x[n - i - 1];
            System.out.println(y[i] + " ");
        }
    }
}
