package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when321SortThen123() {
        int[] data = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when612112243SortThen611122243() {
        int[] data = new int[] {6, 12, 11, 22, 43};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 11, 12, 22, 43};
        Assert.assertArrayEquals(expected, result);
    }
}