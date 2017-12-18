package ru.itis;

import java.util.Random;

public class Ex38 {//Из учебника Абрамского
    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int matrix[][] = new int[7][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[7];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < j) {
                    matrix[i][j] = 0;
                }
            }
        }
        showMatrix(matrix);
    }
}
