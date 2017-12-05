package ru.itis;

import java.util.Scanner;

public class Num38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y;
        int g;
        while (n > 0) {
            y = n % 10;
            n = n / 10;
            g = y;
            if (g % 2 == 0 || g % 3 == 0) {
                System.out.print(g + " ");
            }
        }
    }
}
