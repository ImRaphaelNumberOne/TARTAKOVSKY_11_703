package ru.itis;

import java.util.Scanner;

public class Ex10g {//Из задачник 1
    public static void main(String[] args) {
        double S, x = 5, n, k = 1, e = 1, d = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        S = 0;
        while (k <= 2*n) {
            e = e*x;
            d = d * k;
            S = S+e/d;
            k=k+2;
        }
        System.out.println(S);
    }
}
