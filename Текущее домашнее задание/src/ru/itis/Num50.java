package ru.itis;

import java.util.Scanner;

public class Num50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        int a = 0;
        if (n.length() == m.length()) {
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) != m.charAt(i)) {
                    a = 1;
                    System.out.println("false");
                }
            }
            if (a == 0) {
                System.out.println("true");
            }
        }
        else {
            System.out.println("false");
        }
        System.out.println();

    }
}
