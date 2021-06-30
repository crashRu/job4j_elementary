package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = (float) 1.62;
        System.out.println(expected);
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.01f);
    }

    @Test
    public void whenConvert600RblThen8Dlr() {
        float in = 600;
        float expected = (float) 8.30;
        System.out.println(expected);
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01f);
    }

    @Test
    public void whenConvert0RblThen0Dlr() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01f);
    }
}