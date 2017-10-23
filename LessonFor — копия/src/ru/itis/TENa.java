package ru.itis;//-

import java.util.Scanner;

public class TENa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, e = (-1), b = 0, x = 5, z, l = 0, v = 1, m, n, k;
        n = in.nextInt();
        for (k = 0; k <= n; k++) {
            while(b <= k) {
                e = e * (-1);
                b = b + 1;
                System.out.println(e);
            }
            b = 0;
            while (b <= (2*k + 1)) {
                v = v * x;
                b = b + 1;
                System.out.println(v);
            }
            b = 1;
            while (b <= k) {
                l = l * b;
                b = b + 1;
                System.out.println(l);
            }
            b = 0;
            m = 2*k + 1;
            System.out.println(m);
            z = (e * v)/(l * m);
            S = S + z;
        }
        System.out.println(S);
    }
}
