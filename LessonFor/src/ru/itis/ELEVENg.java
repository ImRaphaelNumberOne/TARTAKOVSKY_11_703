package ru.itis;

import java.util.Scanner;

public class ELEVENg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double S = 1, n, e = 1, m = 1, k = 1;
        n = in.nextInt();
        while (k <= n) {
            e = e * Math.sin(k);
            m = m * Math.cos(k);
            S = S * (e / m);
            k = k + 1;
        }
        System.out.println(S);
    }
}