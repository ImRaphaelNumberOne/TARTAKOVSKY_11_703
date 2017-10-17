package ru.itis;

public class SIXb {
    public static void main(String[] args) {
        int n = 0, f = 1;
        double e, k = 1, S = 0, eps = 0.0001;
        while (Math.abs(k) > eps) {
            S = S + f * k;
            n = n + 1;
            e = 2 * n + 1;
            k = 1.0 / (e * e);
            f = f * (-1);
        }
        System.out.println(S);
    }
}