package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        System.out.println(maxValue(3, 4));
        System.out.println(maxValue(4, 4));
        System.out.println(maxValue(6, 4));
    }

    public static int maxValue(int a, int b) {
        return Math.max(a, b); // по пройденому материалу на изи))
       // return a > b ? a : b;
    }
}
