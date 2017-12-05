package ru.itis;//-

import java.util.Scanner;

public class TWENTYFOURb { // Задачник 1
    public static void main(String[] args) {
        double S = 1, n = 1, m = 1, eps = 0.0001, x, pi = 3.14;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        if (0 <= x && x < (pi / 2)) {
            while (S > eps) {
                m = m * (-1);
                S = S + m * (Math.cos((2 * n - 1) * x) / n); //It is not an algorithm, which is needed
                n = n + 1;
            }
        }
        System.out.println(S);
    }
}
