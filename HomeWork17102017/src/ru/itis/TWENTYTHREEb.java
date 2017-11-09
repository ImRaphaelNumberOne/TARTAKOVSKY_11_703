package ru.itis;//-

import java.util.Scanner;

public class TWENTYTHREEb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l = 0, k, x, v1, v0, v2 = 0, n = 0, e = 2;// почему все в double?
        k = in.nextDouble();
        x = in.nextDouble();
        v1 = v0 = v2 - 1;//откуда это выражение?
        while (n < k) {
            l = l + (-1) * (v2 / e) * Math.cos(v2 * x) * Math.cos(v2 * x);
            e = e * 2;
            n = n + 1;
            v2 = v1 + v0;  //все время одно и то же
        }
        System.out.println(l);

    }
}
