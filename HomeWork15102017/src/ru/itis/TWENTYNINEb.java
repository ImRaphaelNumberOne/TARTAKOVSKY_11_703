package ru.itis;//-

import java.util.Scanner;

public class TWENTYNINEb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    double x0 = 0, x1, eps = 0.0001;
	    x1 = in.nextDouble();
	    if (Math.abs(x1 - x0) > eps) {  //циклит же!
            x1 = Math.cos(x0);          //не меняются х0 и х1
        }
        System.out.println(x1);
    }
}
