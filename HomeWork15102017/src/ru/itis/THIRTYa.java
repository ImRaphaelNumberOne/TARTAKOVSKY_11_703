package ru.itis;

public class THIRTYa {
    public static void main(String[] args) {
        double f = 0, n = 0, g = 1, x0 = 1.0, x1 = 1.1, x, eps = 0.0001;
        x = Math.abs(x1 - x0);
        while (x > eps) {
            while (n <= 5) {
                g = g * x;
                n = n + 1;
            }
            n = 0;
            f = g - x - 0.002;
            x = f;
        }
        System.out.println(f);
    }
}
