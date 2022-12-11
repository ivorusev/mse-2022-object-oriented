package com.uni.mse.introduction.sumator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SumatorTest {

    @Test
    public void testSumIntegerNumbersSuccessful() {
        int sum = Sumator.sum(1, 2);
        assertEquals(3, sum);
    }

    @Test
    public void testSumLFloatNumbersSuccessful() {
        float sum = Sumator.sum(12.0f, 100.2f);
        assertEquals(112.2f, sum, 1);
    }
}
