package ru.itis;

import java.util.Scanner;

public class THIRTYa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double f = 0, n = 1, g = 1, x0, x1, eps = 0.0001;
        x0 = in.nextDouble();
        x1 = in.nextDouble();
        if (Math.abs(x1 - x0) > eps) {
            while (n <= 5) {
                g = g * x1;
                n = n + 1;
            }
            f = g - x1 - 0.002;
        }
        System.out.println(f);
    }
}
