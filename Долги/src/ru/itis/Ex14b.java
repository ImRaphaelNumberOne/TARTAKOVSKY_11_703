package ru.itis;

import java.util.Scanner;

public class Ex14b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, t, eps = 0.0001, g, x, S = 0;
        a = in.nextDouble();
        x = in.nextDouble();
        t = 1/a;
        while (t >= eps) {
            S = S + t * Math.log(t * x);
            t = t * 1/a;
        }
        System.out.println(S + " | " + t);
    }
}
