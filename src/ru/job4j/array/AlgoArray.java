package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4, 12, 11, 90, 13, 18, 24};
        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
        }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}