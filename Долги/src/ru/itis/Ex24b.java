package ru.itis;//-

import java.util.Scanner;

public class Ex24b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 1, x, g, S = 0, h, eps = 0.0001;
        x = sc.nextDouble();
        h = Math.cos(2*n - 1)*x / n;
        while (Math.abs(h) >= eps) {
            h = Math.cos(2*n - 1)*x / n;
            g = (-1) * h;
            S = S + g;
            n++;
        }
        System.out.println(S);
        System.out.println(n);
    }
}
