package ru.itis;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double In = 0, i = 1, h, x1, y1, f, a = 0, b = 1, n;
        n = in.nextDouble();
        h = (b - a) / n;
        while (i <= n) {
            x1 = a + i * h;
            f = (Math.log(1 + x1) / (1 + x1 * x1));
            y1 = f;
            In = In + y1;
            i = i + 1;
            System.out.println(In);
        }
        In = In * h;
        System.out.println(In);
    }
}
