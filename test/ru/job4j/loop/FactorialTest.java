package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.loop.Factorial.calc;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int in = 5;
        int result = calc(in);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int in = 0;
        int result = calc(in);
        Assert.assertEquals(expected, result);
    }
}