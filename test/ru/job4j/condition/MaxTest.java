package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax2To4Then4() {
        int expected = 4;
        Assert.assertEquals(expected, Max.maxValue(2, 4), 0.01);
    }

    @Test
    public void whenMax4To4Then4() {
        int expected = 4;
        Assert.assertEquals(expected, Max.maxValue(4, 4), 0.01);
    }

    @Test
    public void whenMax8To4Then8() {
        int expected = 8;
        Assert.assertEquals(expected, Max.maxValue(8, 4), 0.01);
    }
}