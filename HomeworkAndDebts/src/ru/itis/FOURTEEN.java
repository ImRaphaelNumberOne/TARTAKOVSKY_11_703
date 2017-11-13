package ru.itis;

import java.util.Scanner;

public class FOURTEEN { // со скриншота
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f, n = 0;
        f = in.nextInt();
        while (f > 0) {
            f = f / 10;
            n = n + 1;
        }
        System.out.print(n);
    }
}
