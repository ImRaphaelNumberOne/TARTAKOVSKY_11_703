package ru.itis;

import java.util.Scanner;

public class TWENTYFIVE {
    public static void main(String[] args) {
	    double y0, y1, eps = 0.0001, x;
	    int n = 1;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        if (x >= 1) {
            y0 = x / 3;
        }
        else {
            y0 = x;
        }
        y1 = y0 - (y0 - x / (y0 * y0)) / 3;
            while (Math.abs(y1 - y0) > eps) {
                y0=y1;
                y1 = y0 - (y0 - x / (y0 * y0)) / 3;
            }
        System.out.println(y1);
    }
}
