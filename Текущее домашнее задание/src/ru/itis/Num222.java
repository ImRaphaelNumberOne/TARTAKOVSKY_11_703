package ru.itis;

import java.util.Scanner;

public class Num222 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String row = sc.nextLine();
        char a[] = row.toCharArray();
        for (int i = 0; i < (row.length() / 2); i++) {
            if (a[i] != a[row.length() - 1 - i]) {
                System.out.println("Не палиндром");
                return;
            }
        }
        System.out.println("Палиндром");

    }
}
