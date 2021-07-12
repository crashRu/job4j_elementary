package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        Arrays.stream(result).forEach(System.out::println);
        System.out.println("______________________________________________");
        int[] input2 = new int[]{4, 1, 6, 2};
        int[] result2 = Turn.back(input2);
        Arrays.stream(result2).forEach(System.out::println);
    }
}