package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] suNames = new String[100500];
        String[] names = {"Имя 1", "Имя 2", "Имя 3", "Имя 4"};
        short[] ages = new short[10];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(suNames.length);
        System.out.println(prices.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
