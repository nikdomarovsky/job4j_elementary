package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int index = 1; index < prefix.length; index++) {
            if (word[index] != prefix[1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
