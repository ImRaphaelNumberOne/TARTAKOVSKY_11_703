package ru.itis;

import java.util.Scanner;

public class Ex12b { //Из задачника 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double eps = 0.0001, S = 0, n = 1, g, a;
        while (S > eps) {
            g = Math.pow(-1, n + 1) * Math.pow(x, n);
            a = g / n;
            S = S + a;
            n = n + 1;
        }
        System.out.println(S);
    }
}
