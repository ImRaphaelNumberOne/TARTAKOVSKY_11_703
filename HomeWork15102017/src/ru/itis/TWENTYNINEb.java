package ru.itis;

public class TWENTYNINEb {
    public static void main(String[] args) {
	    double x0 =0 , x1, n = 0, eps = 0.0001;
        x1 = Math.cos(x0);
	    while (Math.abs(x1 - x0) > eps) {
            x0 = x1;
	        x1 = Math.cos(x0);
            n = n + 1;
        }
        System.out.println(n);
	    System.out.println(x1);
    }
}
