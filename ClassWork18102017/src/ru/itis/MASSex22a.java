package ru.itis;

import java.util.Scanner;

public class MASSex22a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum1 = 0;
        n = in.nextInt();
        double [] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
            if (a[i] > 0) {
                sum1 += a[i];
            }
        }
        System.out.println(sum1);
    }
}
