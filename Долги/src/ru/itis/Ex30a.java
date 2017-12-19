package ru.itis;//-

public class Ex30a { //Из задачника 1
    public static void main(String[] args) {
        double f, fp, n = 0, g = 1, x0 = 1.0, x1 = 1.1, eps = 0.0001;
        while (Math.abs(x1 - x0) > eps) {
            while (n <= 5) {                    //what is this?
                g = g * Math.abs(x1 - x0);
                n = n + 1;
            }
            n = 0;
            f = g - Math.abs(x1 - x0) - 0.002;
            fp = g - 1;
            x1 = x0 - f / fp;
        }
        System.out.println(x1);
    }
}
