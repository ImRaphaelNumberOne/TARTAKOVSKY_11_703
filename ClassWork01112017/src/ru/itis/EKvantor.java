package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class EKvantor {
    public static void main(String[] args) {
        System.out.println("Enter n=");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(50);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        boolean f = false;
        for (int i = 0; i < a.length & !f; i++) {
            if (a[i] == 5) {
                f = true;
            }
        }
        if (f)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
