package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = 2; index <= number; index++) {
            result *= index;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
}
