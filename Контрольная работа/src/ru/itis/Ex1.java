package ru.itis;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    double x, a0, b0 = 1, y0 = 0, a1, b1, eps = 0.0001, y1 = 0;
	    x = in.nextDouble();
	    a0 = x;
        b1 = b0 / 2;
	    while (b1 > eps) {
            a1 = a0 * a0;
            b1 = b0 / 2;
            if (a1 < 2) {
                y1 = y0;
            }
            else {
                y1 = y0 + b1;
            }
            y0 = y1;
            b0 = b1;
            a0 = a1;
        }
        System.out.println(y1);
        System.out.println(b1);
    }
}
