package ru.itis;

public class Ex1b { //из задачника 2
    public static void main(String[] args) {
        int S = 0, A = 1, B = 1;
        double C = 0;
        int cos;
        int[] a = {23, 54, 65, 10, 29, 45, 98, 1, 67};
        int[] b = {28, 5, 60, 84, 21, 40, 98, 19, 62};
        int[] c = {7, 34, 67, 82, 91, 50, 43, 21, 49};
        for (int i = 0; i < a.length; i++) {
            S = S + a[i] * b[i];
            A = A * a[i];
            B = B * a[i];
            C = Math.sqrt(C + c[i] * c[i]);
        }
        cos = S / (A * B);
        System.out.println(cos);
        System.out.println(C);
    }
}
