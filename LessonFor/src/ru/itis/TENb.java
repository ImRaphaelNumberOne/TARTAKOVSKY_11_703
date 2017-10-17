package ru.itis;

import java.util.Scanner;

public class TENb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, n, x, a, b, k = 0, z = -1, i;
        n = in.nextInt();
        x = in.nextDouble();
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
    }
}
