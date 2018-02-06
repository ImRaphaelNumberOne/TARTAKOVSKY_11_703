package ru.itis;

import java.util.Scanner;

public class Ex232 {
    /* 232. Из заданной символьной строки выбрать те символы, которые встречаются в ней только один раз,
    в том порядке, в котором они встречаются в тексте. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        char m; //ей мы будем присваивать значение текущего символа
        int n = 0, k = 0; //k - счётчик количества повторений символа
        for (int i = 0; i < t.length(); i++) {
            m = t.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == m) {
                    k++;
                }
            }
            if (k == 1) {
                System.out.print(m);
            }
            k = 0;
        }
    }
}
