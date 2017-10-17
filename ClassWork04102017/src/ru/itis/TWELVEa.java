package ru.itis;

import java.util.Scanner;

public class TWELVEa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1, x;
        x = in.nextInt();
        double S = 1, eps = 0.0001;
        while (S > eps) {
            S = S * (x / n);
            n = n + 1;
        }
        System.out.println(S);
    }
}