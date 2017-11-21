package ru.itis;

import java.lang.Math;
import java.util.Scanner;

public class Ex049 {
    private double X;
    private double Y;

    // Конструктор нулевого вектора
    public Ex049() {
        X = Y = 0;
    }

    // Конструктор вектора с координатами
    public Ex049( double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    // Сложение вектора с другим вектором. Результат - новый объект
    public Ex049 add( Ex049 v1 ) {
        Ex049 v2 = new Ex049( this.X + v1.X, this.Y + v1.Y );
        return v2;
    }

    // Сложение вектора с другим вектором. Результат -  объект сохранён
    public void add2( Ex049 v2) {
        this.X = this.X + v2.X;
        this.Y = this.Y + v2.Y;
    }

    // Вычитание из вектора другого вектора. Результат - новый объект
    public Ex049 sub( Ex049 v1 ) {
        Ex049 v2 = new Ex049( this.X - v1.X, this.Y - v1.Y );
        return v2;
    }

    // Вычитание из вектора другог вектора. Результат - объект сохранён
    public void sub2( Ex049 v2) {
        this.X = this.X - v2.X;
        this.Y = this.Y - v2.Y;
    }

    // Умножение вектора на вещественное число. Результат - новый объект
    public Ex049 mult(double number) {
        Ex049 v2 = new Ex049( this.X * number, this.Y * number);
        return v2;
    }

    // Умножение вектора на вещественное число. Результат - объект сохранён
    public void mult2( Ex049 v2) {
        this.X = this.X * v2.X;
        this.Y = this.Y * v2.Y;
    }

    // Строковое представление вектора
    public String toString() {
        return "Vector2D(" + X + ", " + Y + ")";
    }

    // Длина вектора
    public Ex049 normalize() {
        Ex049 v2 = new Ex049();
        double length = Math.sqrt( this.X*this.X + this.Y*this.Y );
        if (length != 0) {
            v2.X = this.X/length;
            v2.Y = this.Y/length;
        }
        return v2;
    }

    // Скалярное произведение вектора на другой вектор
    public double scalarProduct( Ex049 v1 ) {
        return this.X*v1.X + this.Y*v1.Y;
    }

}
