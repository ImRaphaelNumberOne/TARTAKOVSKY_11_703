package ru.itis;

import java.util.Scanner;

public class Ex300 {
    /* 300. Пароль. Пароль называется криптостойким, если он включает в себя и строчные латинские буквы, и заглавные
    латинские буквы, и цифры, при этом его длина должна быть не менее 8 символов. Требуется по данному паролю
    определить, является ли он криптостойким.  (Вводится одна строка, состоящая только из латинских букв и цифр.
    Количество символов в строке не превышает 100) */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        boolean low = false;//строчная буква
        boolean upper = false;// заглавная буква
        boolean length = false;// больше 8 символов
        boolean digit = false;//наличие цифр
        length = x.length()>=8;
        for (int i = 0; i <x.length(); i++) {
            if((x.charAt(i)>='0')&&(x.charAt(i)<='9'))
                digit = true;
            if(Character.isUpperCase(x.charAt(i)))
                upper = true;
            if(Character.isLowerCase(x.charAt(i)))
                low = true;
        }
        if (low&&upper&&length&&digit)
            System.out.println("Пароль криптостойкий");
        else
            System.out.println("Пароль не криптостойкий");
    }
}
