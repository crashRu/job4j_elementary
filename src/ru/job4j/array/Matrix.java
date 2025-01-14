package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] arrays = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                arrays[row][cell] = (cell + 1) * (row + 1);
            }
        }
        return arrays;
    }
}