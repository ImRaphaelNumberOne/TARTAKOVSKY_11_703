package ru.itis;//-

import java.util.Scanner;

public class Ex24b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 1, x, S = 1, eps = 0.0001;
        x = sc.nextDouble();
        while (S > eps) {
            S = S + (-1)*(Math.cos(2*n-1)*x)/n;
            n++;
        }
        System.out.println(S);
    }
}
