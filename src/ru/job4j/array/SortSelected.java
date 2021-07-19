package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int currentMinIndex = FindLoop.indexOf(data, min, 0, data.length);
            if (currentMinIndex != index) {
                int temp = data[index];
                data[index] = data[currentMinIndex];
                data[currentMinIndex] = temp;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        Arrays.stream(sort(sort(new int[]{2, 4, 7, 12, 18, 1, 17}))).forEach(System.out::println);
    }
}