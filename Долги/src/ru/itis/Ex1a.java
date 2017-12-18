package ru.itis;

public class Ex1a { //из задачника 2
    public static void main(String[] args) {
        int S = 0;
        int[] a = {23, 54, 65, 10, 29, 45, 98, 1, 67};
        int[] b = {28, 5, 60, 84, 21, 40, 98, 19, 62};
        for (int i = 0; i < a.length; i++) {
            S = S + a[i] * b[i];
        }
        System.out.println(S);
    }
}
