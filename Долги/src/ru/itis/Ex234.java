package ru.itis;

import java.util.Scanner;

public class Ex234 {
    /* 234. Дано число в двоичной системе счисления. Проверить правильность ввода этого числа (в его записи должны быть
    только символы 0 и 1). Если число введено неверно, повторить ввод. При правильном вводе перевести число в
    десятичную систему счисления. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean binary = true;
        String a = "";
        while (binary) {
            a = sc.nextLine();
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == '1' || a.charAt(j) == '0')
                    binary = false;
                else {
                    binary = true;
                    j = a.length();
                }
            }
        }
        print(a);
    }
    private static void print(String a) {
        int sum = 0;
        int mult = 1;
        for (int i = a.length()-1; i >=0 ; i--) {
            if(a.charAt(i)=='1'){
                sum = sum + mult;
            }
            mult = mult*2;
        }
        System.out.println(sum);
    }
}
