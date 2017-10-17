package ru.itis;

import java.util.Scanner;

public class TWENTYNINEb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    double x0 = 0, x1, eps = 0.0001;
	    x1 = in.nextDouble();
	    if (Math.abs(x1 - x0) > eps) {
            x1 = Math.cos(x0);
        }
        System.out.println(x1);
    }
}
