package ru.itis;

import java.util.Scanner;

public class Ex12g { //Из задачника 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = 0, S = 0, eps = 0.0001, g, x, e = 1;
        x = in.nextDouble();
        g = x;
        while (g > eps) {
            S = S + g;
            n = n + 1;
            e = e * 2*n;
            g = g * (-1) * (Math.pow(x, 2*n)/ e);
        }
        System.out.println(S);
    }
}
