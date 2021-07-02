package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan140Then46() {
        float in = 140;
        float expected = (float) 46;
        System.out.println(expected);
        short out = (short) Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman120Then23() {
        float in = 120;
        float expected = (float) 23;
        System.out.println(expected);
        short out = (short) Fit.womanWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }
}