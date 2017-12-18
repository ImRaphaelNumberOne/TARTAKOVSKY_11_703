package ru.itis;

public class Ex32b { //Из задачника 1
    public static void main(String[] args) {
        double a = 3, f, x0, x1, eps = 0.0001;
        x0 = a;
        f = 1 + 9 * Math.sin(x0)/2;
        x1 = f;
        while (Math.abs(x1 - x0) > eps) {
            f = 1 + 9 * Math.sin(x0) / 2;
            x0 = x1;
            x1 = f;
        }
        System.out.println(x1);
    }
}
