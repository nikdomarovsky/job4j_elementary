package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = array.length - 1;
        int j = 0;
        while (i > j) {
            if (array[i] + array[j] == target) {
                return new int[]{j, i};
            } else if (array[i] + array[j] < target) {
                j++;
            } else {
                i--;
            }
        }
        return new int[0];
    }
}
