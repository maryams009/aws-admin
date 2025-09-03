package com.aws.admin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void AddTest() {
        int result = Calculator.add(4,5);
        Assertions.assertEquals(9, result);

    }
    @Test
    public void SubtractTest() {
        int result = Calculator.subtraction(5,4);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void MultiplyTest() {
        int result = Calculator.multiply(5,4);
        Assertions.assertEquals(20, result);
    }
    @Test
    public void DivideTest() {
        int result = Calculator.divide(5,5);
        Assertions.assertEquals(1, result);
    }
}
