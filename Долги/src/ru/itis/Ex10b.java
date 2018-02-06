package ru.itis;

import java.util.Scanner;

public class Ex10b {//Из задачника 1
    public static void main(String[] args) {
        double S, x = 5, n, k = 1, e = x, d = 1;
        Scanner in = new Scanner(System.in);
        n = in.nextDouble();
        S = x;
        while (k <= n) {
            e = e*x*x*x*x;
            d = d * 2*k;
            S = S+(((-1)*e)/(d*(4*k+1)));
            k++;
        }
        System.out.println(S);
    }
}
