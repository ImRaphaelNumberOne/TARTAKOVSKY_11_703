package ru.itis;

public class Kvantor22 {
    public static void main(String[] args) {
        int S = 0;
        int [] a = {5, 17, -3, -90, 34, 72, 54, -6, 1, 7};
        int [] w = {2, 5, 7, 7, 9, 14, 25, 25, 38, 54, 72, 54};
        int t = 0;
        int m;
    // 22.б
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] * a[i+1]) < 0) {
                S++;
            }
        }
        System.out.println(S);
    // 22.в
        S = 0;
        for (int i = 0; i < w.length - 1; i++) {
            if (w[i] <= w[i + 1]) {
                S = 1;
            } else {
                S = 0;
                i= w.length;
            }
        }
        if (S==0) {
            for (int i = 0; i < w.length - 1; i++) {
                if (w[i] >= w[i + 1]) {
                    S = -1;
                } else {
                    S = 0;
                    i = w.length;
                }
            }
        }
        if (S == 0) {
            System.out.println("беcпорядочно");
        }
        else {
            if (S == 1) {
                System.out.println("По возрастанию");
            }
            else {
                if (S == -1) {
                    System.out.println("По убыванию");
                }
            }
        }
    // 22.г
        S = 0;
        for (int i = 0; i < w.length - 1; i++) {
            t = w[i];
            for (int j = 0; j < w.length - 1; j++) {
                if (t == w[j]) {
                    S++;
                }
            }
            if (S > 1) {
                i = w.length;
            }
            else {
                S=0;
            }
        }
        if (S > 1) {
            System.out.println("Одинаковые числа есть");
        }
        else {
            System.out.println("Одинаковых чисел нет");
        }
    // 22.д
        t = 0;
        S = 0;
        m = 0;
        for (int i = 0; i < w.length; i++) {
            t = w[i];
            for (int j = 0; j < w.length; j++) {
                if (t == w[j]) {
                    S++;
                }
            }
            if (S == 1) {
                m = m + 1;
            }
            S = 0;
        }

        System.out.println("Число уникальных: " + m);
    }
}
