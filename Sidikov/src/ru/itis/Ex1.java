package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
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
                matrix[i][j] = random.nextInt(20);
            }
        }
        int t;
        for (int row = 0; row < matrix.length; row++) {
            for (int i = matrix[row].length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (matrix[row][j] > matrix[row][j + 1]) {
                        t = matrix[row][j];
                        matrix[row][j] = matrix[row][j + 1];
                        matrix[row][j + 1] = t;
                    }
                }
            }
        }

        showMatrix(matrix);
    }
}
