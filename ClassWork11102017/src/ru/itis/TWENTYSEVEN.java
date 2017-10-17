package ru.itis;

import java.util.Scanner;

public class TWENTYSEVEN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, a1, b1, eps = 0.0001, a0 = 1, b0 = 1 - x;
        x = in.nextDouble();
        b1 = b0 * b0;
        a1 = a0 * (1 + b0);
        while (b1 > eps) {
            a0 = a1;
            b0 = b1;
            a1 = a0 * (1 + b0);
            b1 = b0 * b0;
        }
        System.out.println(a1);
        System.out.println(b1);
    }
}
