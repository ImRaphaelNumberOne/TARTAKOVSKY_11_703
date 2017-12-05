package ru.itis;

import java.util.Scanner;

public class Num34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char g = n.charAt(0);
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i)>g) {
                g = n.charAt(i);
            }
        }
        System.out.println(g + " - Максимальная цифра числа - " + n);
    }
}
