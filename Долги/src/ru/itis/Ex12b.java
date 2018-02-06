package ru.itis;//-

import java.util.Scanner;

public class Ex12b { //Из задачника 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double S = 0, i = -1, n = 1, g = 1, eps = 0.0001, h = 1;
        while (g > eps) {
            i = i * (-1);
            g = g * x;
            h = h * (2*n + 1);
            S = S * i * (g / h);
            n = n + 1;
            System.out.println(S);
        }
        System.out.println(S);
    }
}
