package ru.itis;

import java.util.Scanner;

public class TENg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, n, x, a, b, k = 1, z, i;
        n = in.nextInt();
        x = in.nextDouble();
        while (k <= 2 * n) {
            i = 1;
            a = 1;
            while (i <= k) {
                a = a * x;
                i = i + 1;
            }
            i = 1;
            b = 1;
            while (i <= 2 * k) {
                b = b * i;
                i = i + 2;
            }
            S = S + a / b;
            k = k + 1;
        }
        System.out.println(S);
    }
}
