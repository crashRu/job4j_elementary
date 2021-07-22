package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                int pointNotNull = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        if (array[array.length - 1 - j] != null) {
                            pointNotNull = array.length - 1 - j;
                        }
                        if (pointNotNull > point) {
                            SwapBorder.swap(array, index, pointNotNull);
                        }
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}