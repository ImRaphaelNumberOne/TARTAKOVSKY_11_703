package ru.itis;

import java.util.Scanner;

public class TWELVE {
    public static void main(String[] args) {
        // 12.а
        Scanner in = new Scanner(System.in);
        double n = 1, S = 0, eps = 0.0001, g, x, i = 1, h;
        x = in.nextDouble();
        g = x;
        while (g > eps) {
            S = S + g;
            n = n + 1;
            g = g * (x / n);
        }
        System.out.println(S);
        System.out.println(g);
        // 12.б
        i = 1;
        double e = 1;
        n = 0;
        g = 1;
        while (g > eps) {
            h = 1;
            while (i <= (2*n + 1)) {
                e = e * x;
                h = h * i;
                i = i + 1;
            }
            g = e / h;
            S = S + (-1) * g;
            n = n + 1;
        }
        System.out.println(S);
        // 12.в
        i = 1;
        g = 1;
        while (g > eps) {
            while (i <= n) {
                e = e * x;
                i = i + 1;
            }
            i = 1;
            S = S + ((-1) * e) / n;
            n = n + 1;
        }
        System.out.println(S);
        System.out.println(n);
    }
}
