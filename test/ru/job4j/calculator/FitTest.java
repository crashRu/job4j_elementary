package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan140Then103() {
        float in = 190;
        float expected = (float) 103;
        System.out.println(expected);
        short out = (short) Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman120Then64() {
        float in = 166;
        float expected = (float) 64;
        System.out.println(expected);
        short out = (short) Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }
}