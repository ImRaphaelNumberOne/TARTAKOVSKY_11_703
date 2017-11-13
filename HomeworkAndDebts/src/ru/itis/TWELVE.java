package ru.itis;

import java.util.Scanner;

public class TWELVE { // Из задачника 1
    public static void main(String[] args) {
        // 12.а
        Scanner in = new Scanner(System.in);
        double n = 1, S = 0, eps = 0.0001, g, x, i, h = 1, e = 1;
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
        S = 0;
        i = -1;
        n = 1;
        g = 1;
        while (g > eps) {
            i = i * (-1);
            g = g * x;
            h = h * (2*n + 1);
            S = S * i * (g / h);
            n = n + 1;
            System.out.println(S);
        }
        System.out.println(S);
        // 12.в
        n = 1.0;
        S = 0;
        g = 1.0;
        e = -1.0;
        while (g > eps) {
            e = e * (-1.0);
            g = g * x;
            S = S + (g * e) / n;
            n = n + 1;
        }
        System.out.println(S);
        System.out.println(n);
    }
}
