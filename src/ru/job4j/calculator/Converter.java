package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = (float) (value / 86.21);
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = (float) (value / 72.26); /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(2000);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println(dollar + " Долоров");
    }
}