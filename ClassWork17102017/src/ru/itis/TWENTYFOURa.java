package ru.itis;//-

import java.util.Scanner;

public class TWENTYFOURa {
    public static void main(String[] args) {
        double S = 1, n = 1, eps = 0.0001, x;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        while (S > eps) {
            S = S + (-1) * (Math.cos(2 * n - 1) * x) / n; //неверно понято условие задачи
            n = n + 1;
        }
        System.out.println(S);
    }
}
