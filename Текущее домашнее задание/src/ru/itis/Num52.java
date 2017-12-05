package ru.itis;

import java.util.Scanner;

public class Num52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        int a = 0;
        if (n.length() <= m.length()) {
            for (int i = 0; i < m.length(); i++) {
                if (m.charAt(i) == n.charAt(0)) {
                    for (int j = 0; j < n.length(); j++) {
                        if (n.charAt(j) == m.charAt(i+j)) {
                            a = 1;
                        }
                        else {
                            a = 0;
                            j = n.length();
                        }
                    }
                }
            }
        }
        if (a == 1) {
            System.out.println("true");
        }
        else {System.out.println("false");}
    }
}
