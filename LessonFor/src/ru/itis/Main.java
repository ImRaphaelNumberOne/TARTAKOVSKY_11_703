package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    int i;
        for (i = a; i <= b; i++) {
            System.out.println(i + " ");
        }
    }
}
