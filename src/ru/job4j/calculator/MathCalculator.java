package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumDivisionAndSubtraction(double first, double second) {
        return division(first, second) + subtraction(first, second);
    }

    public static double sumFooOperation(double first, double second) {
        return sumDivisionAndSubtraction(first, second)
                + sumAndMultiply(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}