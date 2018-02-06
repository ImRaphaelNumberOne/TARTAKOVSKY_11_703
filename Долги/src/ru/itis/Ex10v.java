package ru.itis;

import java.util.Scanner;

public class Ex10v {//Из задачника 1
    public static void main(String[] args) {
        double S, x = 5, n, k = 1, e = 1, d = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        S = 0;
        while (k <= n) {
            e = e*x*x;
            d = d * 2*k;
            S = S+(e*(d-1))/d;
            k=k+2;
        }
        System.out.println(S);
    }
}
