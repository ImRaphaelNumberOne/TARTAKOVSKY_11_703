package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class EKvantorMinus {
    public static void main(String[] args) {
        System.out.println("Enter n=");
        Scanner sc = new Scanner(System.in);
        int n;
        /* n = sc.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(50);
        } */
        int[] a = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        boolean f = true;
        for (int i = 0; i < a.length & f; i++) {
            if (a[i] != 0) {
                f = false;
            }
        }
        if (f)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
