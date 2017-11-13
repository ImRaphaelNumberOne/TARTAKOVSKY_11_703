package ru.itis;

import java.util.Scanner;

public class FOURTEENb {
    public static void main(String[] args) {
        double S = 0, t, a, x, eps = 0.0001;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        a = in.nextDouble();
        t = 1;
        while (t >= eps) {
            t = t * 1 / a;
            S = S + t * Math.log(t * x);
        }
        System.out.println(S);
    }
}
