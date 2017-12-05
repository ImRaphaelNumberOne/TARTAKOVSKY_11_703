package ru.itis;

public class Num35 {
    public static void main(String[] args) {
        int g;
        int y = 0;
        int [] x = new int[]{123, 8, 2675, 113, 978421};
        int n = x.length;
        int z = 10;
        for (int i = 0; i < n; i++) {
            g = x[i];
            while (g > 0) {
                g = g / 10;
                y = y + 1;
            }
            if (z > y) z = y;
            y = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println( "\nминимальное количество цифр среди элементов массива " + z);
    }
}
