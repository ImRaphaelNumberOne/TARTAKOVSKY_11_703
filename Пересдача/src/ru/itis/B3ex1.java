package ru.itis;

import java.util.Scanner;

public class B3ex1 {
    public static void main(String[] args) {
        double eps = 0.0001, g = 1, k = 1, S = 0, r = 1, x, m = 2, n = 1;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        while (g > eps) {
            r = r * 2 * k;
            System.out.println(m);
            n = n * (x * x);
            g = ((-1) * m * n)/r;
            m = m * 4;
            S = S + g;
            k++;
        }
        S = S + 1;
        System.out.println(g);
        System.out.println(S);
    }
}
