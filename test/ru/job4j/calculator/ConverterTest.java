package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Converter;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = (float) (in / 86.21);
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert600RblThen3Dlr() {
        float in = 600;
        float expected = (float) (in / 72.26);
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert0RblThen3Dlr() {
        float in = 0;
        float expected = (float) (in / 72.26);
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}