package ru.job4j.condition;

public class Max {
    public static int maxValue(int a, int b) {
        return a > b ? a : b;
    }

    public static int maxValue(int a, int b, int c) {
        return maxValue(maxValue(a, b), c);
    }

    public static int maxValue(int a, int b, int c, int d) {
        return maxValue(maxValue(a, b), maxValue(c, d));
    }

    public static void main(String[] args) {
        System.out.println(maxValue(3, 4));
        System.out.println(maxValue(4, 4));
        System.out.println(maxValue(6, 4));
    }
}
