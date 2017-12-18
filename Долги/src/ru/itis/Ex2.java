package ru.itis;

import java.util.Scanner;

public class Ex2 { //из задачника 2
    public static void main(String[] args) {
        double[] x = {28, 5, 60, 84, 21, 40, 98, 19, 54, 10, 29, 45, 1, 67};
        double u, s1 = 0, s2 = 0, sm2 = 0, sm3 = 0, sm4 = 0, S, m2, m3, m4, g1, g2;
        for (int i = 0; i < x.length; i++) {
            s1 = s1 + x[i];
        }
        u = (1/x.length) * s1;
        for (int i = 0; i < x.length; i++) {
            s2 = s2 + Math.pow((x[i] - u), 2);
            sm2 = sm2 + Math.pow((x[i] - u), 2);
            sm3 = sm3 + Math.pow((x[i] - u), 3);
            sm4 = sm4 + Math.pow((x[i] - u), 4);
        }
        S = (1/ (x.length - 1)) * s2;
        m2 = (1/ x.length) * sm2;
        m3 = (1/ x.length) * sm3;
        m4 = (1/ x.length) * sm4;
        g1 = m3 / (Math.sqrt(Math.pow(m2, 3)));
        g2 = (m4 / Math.pow(m2, 2)) - 3;
        System.out.println(u);
        System.out.println(S);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(g1);
        System.out.println(g2);
    }
}