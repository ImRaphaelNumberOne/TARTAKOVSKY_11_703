package ru.itis;

public class Massive13 {
    public static void main(String[] args) {
        int S = 1, L = 1;
        int [] a = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int [] w = new int[a.length];
        int [] v = new int[a.length];

// 13.a
    for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i+1]) {
                S++;
            }
        }
        System.out.println(S);
// 13.е
        S = 0;
        for (int i = 1; i < a.length - 1; i++) {
           if (a[i-1] != a[i] && a[i] != a[i+1]) {
              S++;
           }
        }
        if (a[a.length - 2] != a[a.length - 1]) {
            S++;
        }
        System.out.println(S);
// 13.ж
        if (a[0] != a[1]) {
            w[0] = a[0];
        }
        else {
            w[0] = 0;
        }
        for (int i = 1; i < a.length - 1; i++) {
           if (a[i-1] != a[i] && a[i] != a[i+1]) {
              w[i] = a[i];
            }
            else {
              w[i] = 0;
            }
        }
        if (a[a.length - 1] != a[a.length - 2]) {
            w[a.length - 1] = a[a.length - 1];
        }
        else {
            w[a.length - 1] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(w[i] + ", ");
        }
// 13.в
/*      S = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                S++;
                w[i] = L;
                L = 1;
            }
            else {
                L++;
            }
        }
        if (a[a.length - 2] != a[a.length - 1]) {
            w[a.length-1] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(w[i] + ", ");
        }
        int [] m = new int [S]; */
    }
}