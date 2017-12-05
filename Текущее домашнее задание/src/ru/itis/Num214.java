package ru.itis;

import java.util.Scanner;

public class Num214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        // преобразовали строку в массив символов
        char textAsArray[] = text.toCharArray();
        // текущеее слово
        String currentWord = "";
        // бежим по всему массиву
        for (int i = 0; i < text.length(); i++) {
            // если текущий символ не пробел
            if (textAsArray[i] != ' ') {
                // добавляем его к слову
                currentWord += textAsArray[i];
            }
            // если символ пробел
            if (textAsArray[i] == ' ') {
                // проверяем, начинается ли слово на ту же букву, что и оканчивается
                if (currentWord.charAt(0) == currentWord.charAt(currentWord.length() - 1)) {
                    System.out.println(currentWord);
                }
                currentWord = "";
            }
        }
        if (currentWord.charAt(0) == currentWord.charAt(currentWord.length() - 1)) {
            System.out.println(currentWord);
        }
    }
}
