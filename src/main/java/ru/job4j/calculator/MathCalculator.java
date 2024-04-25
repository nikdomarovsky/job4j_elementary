package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAnddivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double differenceAnddivideandsumAndMultiply(double first, double second) {
        return difference(first, second)
                + divide(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAnddivide(10, 20));
        System.out.println("Результат расчета равен: " + differenceAnddivideandsumAndMultiply(10, 20));
    }
}