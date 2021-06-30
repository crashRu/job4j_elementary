package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return (float) (value / 86.21);
    }

    public static float rubleToDollar(float value) {
        return (float) (value / 72.26);
    }

    public static void testRubleToEuro() {
        int in = 140;
        int expected = (int) (140 / 86.21);
        int out = (int) rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }

    public static void testRubleToDollar() {
        int in = 140;
        int expected = (int) (140 / 72.26);
        int out = (int) rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + 140 / 72.26 + " . Test result : " + passed);
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(2000);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println(dollar + " Долоров");

        System.out.println("Tests");
        testRubleToDollar();
        testRubleToEuro();
    }
}