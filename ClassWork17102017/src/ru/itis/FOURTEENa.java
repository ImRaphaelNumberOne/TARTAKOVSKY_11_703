package ru.itis;//-

import java.util.Scanner;

public class FOURTEENa {
    public static void main(String[] args) {
	    double S = 0, t, x, k = 1, eps = 0.0001;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        t = 1 / k;
        while (t >= eps) {
            t = t * 1 / k;  //неверная логика
            S = S + (-1) * t * Math.sin(t * x) * Math.sin(t * x);
            k = k + 1;
        }
        System.out.println(S);
        System.out.println(k);
    }
}
