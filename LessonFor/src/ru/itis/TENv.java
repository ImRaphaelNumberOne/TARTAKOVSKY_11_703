package ru.itis;

import java.util.Scanner;

public class TENv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, n, x, a, b, k = 1, z, i;
        n = in.nextInt();
        x = in.nextDouble();
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