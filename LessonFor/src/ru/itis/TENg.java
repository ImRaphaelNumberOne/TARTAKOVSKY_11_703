package ru.itis;

import java.util.Scanner;

public class TENg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, b = 0, x = 5, z, l = 0, v = 1, n, k;
        n = in.nextInt();
        for (k = 0; k <= n; k++) {
            while (b <= k) {
                v = v * x;
                b = b + 1;
                System.out.println(v);
            }
            b = 0;
            while (b <= k) {
                l = l * b;
                b = b + 2;
                System.out.println(l);
            }
            b = 0;
            z = v / l;
            S = S + z;
        }
        System.out.println(S);
        //то же самое
    }
}
