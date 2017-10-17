package ru.itis;

public class FIVEb {
    public static void main(String[] args) {
        int n = 1;
        double pi = 3.1415926, e, g = 1, S = 1, eps = 0.0001, p = 1;
        while (Math.abs(S - pi/4) > eps) {
            g = g + 2;
            p = p * (-1);
            e = 1.0/g * p;
            S = S + e;
            System.out.println(S);
            n = n + 1;
            System.out.println(n);
        }
        System.out.println(n);
    }
}
