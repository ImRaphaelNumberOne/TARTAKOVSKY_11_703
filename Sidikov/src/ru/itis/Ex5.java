package ru.itis;//-

import java.util.Random;

public class Ex5 {
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
        int matrix[][] = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[5];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        showMatrix(matrix);
        int sum = 0;                               //you must walk on the matrix!
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j]; // Скалдываем все элементы
            }
        }
        int M = (matrix.length * (matrix.length * matrix.length + 1)) / 2; // Магическая константа
        // если полученное число от деления будет константе, то значит матрица магическая
        if (M == (sum/matrix.length)) { System.out.println("Матрица магическая"); }
        else { System.out.println("Матрица не магическая"); }
    }
}
