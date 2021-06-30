package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumDivisionAndSubtraction(double first, double second) {
        return MathFunction.division(first, second) + MathFunction.subtraction(first, second);
    }

    public static double sumFooOperation(double first, double second) {
        return sumDivisionAndSubtraction(first, second)
                + sumAndMultiply(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}