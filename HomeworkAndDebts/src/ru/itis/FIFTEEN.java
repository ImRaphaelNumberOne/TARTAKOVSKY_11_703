package ru.itis;

import java.util.Scanner;

public class FIFTEEN { // со скриншота
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, x , y;
        n = in.nextDouble();
        while (n >= 1) {
            n = n / 10;
            x = Math.floor(n);
            y = Math.round((n - x) * 10);
            if ((y % 2) != 0) {
                System.out.println(y);    //почему цифры double?
            }
            n = x;
        }
    }
}
