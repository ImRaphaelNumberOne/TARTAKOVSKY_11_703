package ru.itis;//-

import java.util.Scanner;

public class THIRTYTWOb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double  f = 0, x1 = 1, x0, eps = 0.0001;
        x0 = in.nextDouble();
<<<<<<< HEAD
        while (Math.abs(x1 - x0) > eps) {
            f = 1 + 9 * Math.sin(Math.abs(x1 - x0)) / 2;
=======
        if (Math.abs(x1 - x0) > eps) {   //о чем речь?
            f = 1 + 9 * Math.sin(x0) / 2;
>>>>>>> 1fcbdef3f9397c99b5edfe6f5bc8f0ae4777346b
        }
        System.out.println(f);
    }
}
