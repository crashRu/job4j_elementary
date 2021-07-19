package ru.job4j.array;

import java.util.Arrays;

import static ru.job4j.array.SwapBorder.swap;
public class SortSelected {

    public static int[] sort(int[] data) {
        int arraySize = data.length - 1;
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, arraySize);
            int currentMinIndex = FindLoop.indexOf(data, min, index, arraySize);
            swap(data, index, currentMinIndex);
        }
        return data;
    }

    public static void main(String[] args) {
        Arrays.stream(sort(sort(new int[]{2, 4, 7, 12, 18, 1, 17}))).forEach(System.out::println);
    }
}