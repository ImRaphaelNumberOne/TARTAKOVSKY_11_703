package ru.itis;

public class Ex3 { //Из задачника 2
    public static void main(String[] args) {
        double[] x = {28, 5, 60, 84, 21, 40, 98, 19, 54, 10, 29, 45, 1, 67};
        double s = 0;
        double S;
        for (int i = 0; i < x.length; i++) {
            s = s + (1/x[i]);
        }
        S = x.length / s;
        System.out.println(S);
    }
}
