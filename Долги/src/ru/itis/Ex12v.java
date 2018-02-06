package ru.itis;

import java.util.Scanner;

public class Ex12v { //Из задачника 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 1, S = 0, eps = 0.0001, g=1, x, e = -1;
        x = in.nextDouble();
        while (g > eps) {
            e = e * (-1.0);
            g = g * x;
            S = S + (g * e) / n;
            n = n + 1;
        }
        System.out.println(S);
        System.out.println(n);
    }
}
