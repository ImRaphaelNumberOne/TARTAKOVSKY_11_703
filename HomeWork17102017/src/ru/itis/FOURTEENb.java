package ru.itis;

import java.util.Scanner;

public class FOURTEENb {
    public static void main(String[] args) {
        double S = 0, t, a, x, k = 1, eps = 0.0001;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        a = in.nextDouble();
        t = 1 / a;
        while (t >= eps) {
            t = t * 1 / a;
            S = S + t * Math.log(t * x);
            k = k + 1;
        }
        System.out.println(S);
        System.out.println(k);
    }
}
