package ru.itis;

import java.util.Scanner;

public class Ex29b { //Из задачника 1
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        double x0, e = 1, n = 1, eps = 0.0001;
        x0 = put.nextDouble();
        double x1 = Math.sqrt(Math.cos(x0));
        while (e > eps) {
            x0 = x1;
            x1 = Math.cos(x0);
            e = x1 - x0;
            if (e < 0) {
               e = e * -1;
            }
            n++;
        }
        System.out.println(n);
    }
}
