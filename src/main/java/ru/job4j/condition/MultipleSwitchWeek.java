package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Понедельник"));
        System.out.println(numberOfDay("Вторник"));
        System.out.println(numberOfDay("Среда"));
        System.out.println(numberOfDay("Четверг"));
        System.out.println(numberOfDay("Пятница"));
        System.out.println(numberOfDay("Суббота"));
        System.out.println(numberOfDay("Воскресенье"));
        System.out.println(numberOfDay("Ошибка"));
    }
}
