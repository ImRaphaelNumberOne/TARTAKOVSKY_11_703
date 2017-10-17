package ru.itis;

import java.util.Scanner;

public class THIRTYTWOb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double  f = 0, x1 = 1, x0, eps = 0.0001;
        x0 = in.nextDouble();
        if (Math.abs(x1 - x0) > eps) {
            f = 1 + 9 * Math.sin(x0) / 2;
        }
        System.out.println(f);
    }
}
