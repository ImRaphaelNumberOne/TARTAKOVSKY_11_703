package ru.itis;

import java.util.Scanner;

public class B3ex2 {
    public static void main(String[] args) {
        double n = 0, x0, x1, f, eps = 0.0001;
        Scanner sc = new Scanner(System.in);
        x0 = sc.nextDouble();
        f = x0*x0*x0*x0 - 3*x0*x0 + Math.log(x0);
        x1 = 1 / f + Math.sqrt(f/2);
        n++;
        while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
            f = x0*x0*x0*x0 - 3*x0*x0 + Math.log(x0);
            x1 = 1 / f + Math.sqrt(f/2);
            n++;
        }
        System.out.println(x1);
    }
}
