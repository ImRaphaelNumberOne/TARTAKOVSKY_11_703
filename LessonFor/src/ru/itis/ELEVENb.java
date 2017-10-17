package ru.itis;

import java.util.Scanner;

public class ELEVENb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 0, n, e = 1, m = 1, k = 1;
        n = in.nextInt();
        while (k <= n) {
            e = e * Math.cos(k);
            m = m * Math.sin(k);
            S = S + (e / m);
            k = k + 1;
        }
        System.out.println(S);

    }
}
