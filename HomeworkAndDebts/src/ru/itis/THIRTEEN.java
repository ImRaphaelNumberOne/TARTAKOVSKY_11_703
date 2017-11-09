package ru.itis;

import java.util.Scanner;

public class THIRTEEN {
    public static void main(String[] args) { // со скриншота
        Scanner in = new Scanner(System.in);
        double n;
        n = in.nextDouble();
        while (n > 0) {
            n = n / 10;
        }
    }
}
