package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class SortBut {
    public static void main(String[] args) {
        System.out.println("Enter n=");
        Scanner sc = new Scanner(System.in);
        int n, t;
        n = sc.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}
