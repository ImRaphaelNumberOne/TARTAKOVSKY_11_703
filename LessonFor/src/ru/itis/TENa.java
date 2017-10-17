package ru.itis;

import java.util.Scanner;

public class TENa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, n, x, a, b, k = 0, z = -1, i;
        n = in.nextInt();
        x = in.nextDouble();
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
       // Ой-ой. Совсем не тот стиль программирования, который нам нужен
    }
}