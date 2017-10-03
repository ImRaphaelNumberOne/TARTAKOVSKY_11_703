package ru.itis;

import java.util.Scanner;

public class ELEVENb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, n, l, g = 1, e = 1, m = 1, k;
        n = in.nextInt();
        for (k = 0; k <= n; k++) {
            while (m <= k) {
                g = g * Math.cos(m);
                m = m + 1;
            }
            m = 1;
            while (m <= k) {
                e = e * Math.sin(m);
                m = m + 1;
            }
            m = 1;
            l = g / e;
            S = S + l;
        }
        System.out.println(S);
        //то же самое
    }
}
