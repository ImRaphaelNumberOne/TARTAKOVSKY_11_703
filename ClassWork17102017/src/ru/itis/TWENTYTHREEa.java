package ru.itis;//-

import java.util.Scanner;

public class TWENTYTHREEa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l = 0, k, x, v1, v0, v2 = 0, n = 0;
        k = in.nextDouble();
        x = in.nextDouble();
        v1 = v0 = v2 - 1;
        while (n < k) {
            l = l + Math.log(v2 * x);
            n = n + 1;
            v2 = v1 + v0;// не изменяется
        }
        System.out.println(l);
    }
}
