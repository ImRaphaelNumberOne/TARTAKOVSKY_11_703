package ru.itis;

import java.util.Scanner;

public class MASSex1a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0;
        n = in.nextInt();
        double [] a = new double[n];
        double [] b = new  double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
            b[i] = Math.random();
            sum += a[i] * b[i];
        }
        System.out.println(sum);
    }
}
