package ru.itis;

import java.util.Scanner;

public class THIRTEEN {
    public static void main(String[] args) { // со скриншота
        Scanner in = new Scanner(System.in);
        double n, x , y, m = -1, S = 0;
        n = in.nextDouble();
        while (n >= 1) {
            n = n / 10;
            x = Math.floor(n);
            y = Math.round ((n-x)*10);
            m = m * (-1);
            y = y * m;
            S = S + y;
            n = x;
            System.out.println(y);
        }
        System.out.println(S);
    }
}
