package ru.itis;// не задавала

import java.util.Scanner;

public class THIRTYTHREE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x0, x1, fx = 0, fz = 1, z, eps = 0.0001;
        x0 = in.nextDouble();
        z = in.nextDouble();
        x1 = x0 - (x0 - z) / (fx - fz);
        if (Math.abs(x1 - x0) > eps) {
                x1 = x0 - (x0 - z) / (fx - fz);
        }
        System.out.println(x1);
    }
}
