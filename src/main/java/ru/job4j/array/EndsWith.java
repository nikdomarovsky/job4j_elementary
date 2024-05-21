package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length; index++) {
            if (word[word.length - index - 1] != postfix[postfix.length - index - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
