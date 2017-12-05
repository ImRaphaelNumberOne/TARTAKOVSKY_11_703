package ru.itis;//-

import java.util.Scanner;

public class TEN { // Задачник 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, v = 1,  n, x, a, b, k = 0, z = -1, i;
        n = in.nextInt();
        x = in.nextDouble();
        // 10.a
        while (k <= n) {
            i = 1;
            a = 1;
            while (i <= 2 * k + 1) {
                a = a * x;
                i = i + 1;
            }
            i = 1;
            b = 1;
            while (i <= k) {
                b = b * i;
                i = i + 1;
            }
            z = z * (-1);
            S = S + (a * z) / (b * (2 * k + 1));
            k = k + 1;
        }
        System.out.println(S);
        // 10.b
        k = 0;
        z = -1;
        S = 0;
        while (k <= n) {
            i = 1;
            a = 1;
            while (i <= 4 * k + 1) {
                a = a * x;
                i = i + 1;
            }
            i = 1;
            b = 1;
            while (i <= 2 * k) {
                b = b * i;
                i = i + 1;
            }
            z = z * (-1);
            S = S + (a * z) / (b * (4 * k + 1));
            k = k + 1;
        }
        System.out.println(S);
        // 10.v
        k = 1;
        while (k <= n) {
            i = 1;
            a = 1;
            while (i <= 2 * k) {
                a = a * x;
                i = i + 1;
            }
            i = 1;
            b = 1;
            while (i <= 2 * k) {
                b = b * i;
                i = i + 2;
            }
            b = 0;
            while (b <= (2*k)) {
                v = v * x;
                b = b + 2;
                System.out.println(v);
            }
            i = 1;
            z = 1;
            while (i <= (2 * k - 1)) {
                z = z * i;
                i = i + 2;
            }
            S = S + (a * z) / b;
            k = k + 1;
        }
        System.out.println(S);
    }
}
