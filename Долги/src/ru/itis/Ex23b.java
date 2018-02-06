package ru.itis;

import java.util.Scanner;

public class Ex23b {//Из задачника 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0, v2, v1, v0, S = 0, j = 2, h, x, a, e = -1;
        x = sc.nextDouble();
        a = sc.nextDouble();
        v1 = a;
        v0 = a;
        v2 = v1 + v0;
        while (n < 9) {
            h = (-1) * e * (v2/(j * 2))* (Math.cos(v2 * x) * Math.cos(v2 * x));
            S = S + h;
            v1 = h;
            v0 = v1;
            v2 = v0 + v1;
            n++;
        }
        System.out.println(S);
        System.out.println(n);
    }
}
