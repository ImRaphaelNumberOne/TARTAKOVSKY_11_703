package ru.itis;//-

import java.util.Scanner;

public class TWENTYFOURb {
    public static void main(String[] args) {
        double S = 1, n = 1, m = 1, eps = 0.0001, x;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        while (S > eps) {
            m = m * n;
            S = S + (Math.sin(n * x) / m);  // неправильно понято условие задачи 
            n = n + 1;
        }
        System.out.println(S);
    }
}
